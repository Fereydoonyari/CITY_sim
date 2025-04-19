package citysim;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;


class Tile {
    private BufferedImage sprite;
    private int x, y;

    public Tile(int x, int y, String assetPath) throws SimulationException {
        this.x = x;
        this.y = y;
        try {
            sprite = ImageIO.read(new File(assetPath));
        } catch (IOException e) {
            throw new SimulationException("Tile asset not found at: " + assetPath);
        }
    }

    public void draw(Graphics g) {
        g.drawImage(sprite, x, y, null);
    }
}