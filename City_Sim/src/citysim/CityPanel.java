package citysim;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

class CityPanel extends JPanel {
    private City city;

    public CityPanel() throws SimulationException {
        city = new City();
        Timer timer = new Timer(100, e -> {
            city.update();
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        city.draw(g);
    }
}
