package citysim;

/**
 * Configuration class for the city simulation.
 * Contains all constants and settings used throughout the application.
 */
public class SimulationConfig {
    // Window settings
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    
    // Grid settings
    public static final int GRID_WIDTH = 10;
    public static final int GRID_HEIGHT = 10;
    public static final int TILE_WIDTH = 64;
    public static final int TILE_HEIGHT = 32;
    
    // Entity movement settings
    public static final int CAR_SPEED = 2;
    public static final int PERSON_SPEED = 1;
    
    // Asset paths
    public static final String ASSETS_DIR = "Assets";
    public static final String TILE_ASSET = ASSETS_DIR + "/1.png";
    public static final String CAR_ASSET = ASSETS_DIR + "/2.png";
    public static final String PERSON_ASSET = ASSETS_DIR + "/3.png";
    
    // Animation settings
    public static final int ANIMATION_DELAY = 100; // milliseconds
    
    private SimulationConfig() {
        // Private constructor to prevent instantiation
    }
} 