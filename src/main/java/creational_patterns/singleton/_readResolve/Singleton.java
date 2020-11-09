package creational_patterns.singleton._readResolve;

import java.io.ObjectStreamException;
import java.io.Serializable;

// With readResolve() method
public class Singleton implements Serializable {

    public String name;
    private static volatile Singleton instance = new Singleton();  // singleton object

    // private constructor
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
