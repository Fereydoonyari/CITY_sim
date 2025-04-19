package citysim;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

/**
 * Manages loading and caching of game assets.
 */
public class ResourceManager {
    private static final Map<String, BufferedImage> imageCache = new HashMap<>();
    
    /**
     * Loads an image from the specified path.
     * @param path The path to the image file
     * @return The loaded BufferedImage
     * @throws SimulationException if the image cannot be loaded
     */
    public static BufferedImage loadImage(String path) throws SimulationException {
        // Check cache first
        if (imageCache.containsKey(path)) {
            return imageCache.get(path);
        }
        
        // Create assets directory if it doesn't exist
        File assetsDir = new File(SimulationConfig.ASSETS_DIR);
        if (!assetsDir.exists()) {
            if (!assetsDir.mkdir()) {
                throw new SimulationException("Failed to create assets directory");
            }
        }
        
        // Load the image
        try {
            File imageFile = new File(path);
            if (!imageFile.exists()) {
                throw new SimulationException("Asset not found: " + path);
            }
            
            BufferedImage image = ImageIO.read(imageFile);
            if (image == null) {
                throw new SimulationException("Failed to load image: " + path);
            }
            
            // Cache the image
            imageCache.put(path, image);
            return image;
        } catch (IOException e) {
            throw new SimulationException("Error loading image: " + e.getMessage());
        }
    }
    
    /**
     * Clears the image cache.
     */
    public static void clearCache() {
        imageCache.clear();
    }
} 