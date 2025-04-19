package citysim;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;


class Car extends Entity {
    private BufferedImage sprite;

    public Car(int x, int y, String assetPath) throws SimulationException {
        super(x, y);
        try {
            sprite = ImageIO.read(new File(assetPath));
        } catch (IOException e) {
            throw new SimulationException("Car asset not found at: " + assetPath);
        }
    }

    @Override
    public void update() {
        x += 2;
        if (x > 800) x = 0;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(sprite, x, y, null);
    }
}
