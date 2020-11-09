package creational_patterns.singleton.static_block_initialization;

// Static block initialization
public class Singleton {

    public String name;
    private static volatile Singleton instance;

    static {
        try {
            instance = new Singleton();  // singleton object
        } catch (Exception ex) {
            throw new RuntimeException("OHH ****, I was not expecting this!", ex);
        }
    }

    // private constructor
    private Singleton() {
    }

    
    public static Singleton getInstance() {
        return instance;
    }
}
