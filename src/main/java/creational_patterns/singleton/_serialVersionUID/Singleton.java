package creational_patterns.singleton._serialVersionUID;

import java.io.ObjectStreamException;
import java.io.Serializable;

// With serialVersionUID
public class Singleton implements Serializable {

    private static final long serialVersionUID = 1l;

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
