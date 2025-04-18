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

    public Tile(int x, int y, String assetPath) throws IOException {
        this.x = x;
        this.y = y;
        sprite = ImageIO.read(new File(assetPath));
    }

    public void draw(Graphics g) {
        g.drawImage(sprite, x, y, null);
    }
}
