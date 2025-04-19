package citysim;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

/**
 * Abstract base class for all entities in the city simulation.
 * Provides basic position and rendering functionality.
 */
abstract class Entity {
    protected int x, y;
    
    /**
     * Creates a new entity at the specified position.
     * @param x The x-coordinate of the entity
     * @param y The y-coordinate of the entity
     */
    public Entity(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Updates the entity's state.
     * Should be called once per frame.
     */
    public abstract void update();
    
    /**
     * Draws the entity on the screen.
     * @param g The graphics context to draw with
     */
    public abstract void draw(Graphics g);
}
