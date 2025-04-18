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

    public Person(int x, int y, String assetPath) throws IOException {
        super(x, y);
        sprite = ImageIO.read(new File(assetPath));
    }

    @Override
    public void update() {
        y += 1;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(sprite, x, y, null);
    }
}
