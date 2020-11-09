package creational_patterns.singleton.lazy_initialization;

// Lazy initialization
public class Singleton {

    public String name;
    private static volatile Singleton instance = null;

    // private constructor
    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                // Double check
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
