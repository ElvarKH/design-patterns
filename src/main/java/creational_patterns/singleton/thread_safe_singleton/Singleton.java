package creational_patterns.singleton.thread_safe_singleton;

// Thread Safe Singleton
public class Singleton {

    public String name;
    private static volatile Singleton instance = null;

    // private constructor
    private Singleton() {
    }

    synchronized public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
