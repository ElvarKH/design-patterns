package creational_patterns.singleton.bill_pugh_singleton;

// Bill Pugh initialization
public class Singleton {

    public static String name;

    // private constructor
    private Singleton() {
    }

    // nested class
    private static class LazyHolder {

        // when request for this class
        static {
            System.out.println("" +
                    "LazyHolder class (nested) initialized ---\n\n" +
                    "Singleton object created ---\n");
        }

        private static final Singleton instance = new Singleton(); // singleton object
    }

    public static Singleton getInstance() {
        System.out.println("Call to getInstance() method ---\n");
        return LazyHolder.instance;
    }
}
