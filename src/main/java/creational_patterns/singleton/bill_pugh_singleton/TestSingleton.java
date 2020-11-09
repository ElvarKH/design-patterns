package creational_patterns.singleton.bill_pugh_singleton;

public class TestSingleton {
    public static void main(String[] args) {

        // Singleton singleton = new Singleton(); // compile error (Singleton() has private access)

        // LazyHolder class is not initialized on this line
        System.out.println("" +
                "Static variable of Singleton class" +
                Singleton.name); // static variable


        // LazyHolder class initialized
        Singleton singleton1111 = Singleton.getInstance();
        singleton1111.name = "1111";

        Singleton singleton2222 = Singleton.getInstance();
        singleton2222.name = "2222";

        Singleton singleton3333 = Singleton.getInstance();
        singleton3333.name = "3333";

        Singleton singleton4444 = Singleton.getInstance();
        singleton4444.name = "4444";

        System.out.println(singleton1111.name); // 4444      // because are the same objects
        System.out.println(singleton2222.name); // 4444
        System.out.println(singleton2222.name); // 4444
    }
}
