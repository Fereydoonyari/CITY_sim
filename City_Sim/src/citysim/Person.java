package citysim;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

class Person extends Entity {
    private BufferedImage sprite;

    public Person(int x, int y, String assetPath) throws SimulationException {
        super(x, y);
        try {
            sprite = ImageIO.read(new File(assetPath));
        } catch (IOException e) {
            throw new SimulationException("Person asset not found at: " + assetPath);
        }
    }

    @Override
    public void update() {
        y += 1;
        if (y > 600) y = 0;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(sprite, x, y, null);
    }
}