package citysim;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

class City {
    private List<Tile> tiles = new ArrayList<>();
    private List<Entity> entities = new ArrayList<>();

    public City() throws SimulationException {
        loadTiles();
        loadEntities();
    }

    private void loadTiles() throws SimulationException {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tiles.add(new Tile(i * 64, j * 32, "Assets/1.png"));
            }
        }
    }

    private void loadEntities() throws SimulationException {
        entities.add(new Car(0, 0, "Assets/2.png"));
        entities.add(new Person(50, 50, "Assets/3.png"));
    }

    public void update() {
        for (Entity entity : entities) {
            entity.update();
        }
    }

    public void draw(Graphics g) {
        for (Tile tile : tiles) tile.draw(g);
        for (Entity entity : entities) entity.draw(g);
    }
}
