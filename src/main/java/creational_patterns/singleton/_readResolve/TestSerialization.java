package creational_patterns.singleton._readResolve;

import java.io.*;

public class TestSerialization {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();

        try {
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("object.ser"));
            out.writeObject(singleton1);
            out.close();

            singleton1.name = "First object"; // changed after serialization


            // Deserialize file
            ObjectInput in = new ObjectInputStream(new FileInputStream("object.ser"));
            Singleton singleton2 = (Singleton) in.readObject();
            in.close();


            System.out.println(singleton1.name); // First object
            System.out.println(singleton2.name); // First object   // because readResolve() implemented

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
