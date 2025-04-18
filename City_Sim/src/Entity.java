import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;


abstract class Entity {
    protected int x, y;
    public Entity(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void update();
    public abstract void draw(Graphics g);
}
