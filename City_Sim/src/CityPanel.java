import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;


class CityPanel extends JPanel {
    private List<Entity> entities = new ArrayList<>();
    private List<Tile> tiles = new ArrayList<>();

    public CityPanel() throws IOException {
        // Load tiles (hardcoded preset)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tiles.add(new Tile(i * 64, j * 32, "assets/1.png"));
            }
        }
        // Add entities
        entities.add(new Car(0, 0, "assets/2.png"));
        entities.add(new Person(50, 50, "assets/3.png"));

        Timer timer = new Timer(100, e -> {
            for (Entity entity : entities) {
                entity.update();
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Tile tile : tiles) tile.draw(g);
        for (Entity entity : entities) entity.draw(g);
    }
}
