package creational_patterns.singleton.eager_initialization;

// Eager initialization
public class Singleton {

    public String name;
    private static volatile Singleton instance = new Singleton(); // singleton object

    // private constructor
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return instance;
    }
}
