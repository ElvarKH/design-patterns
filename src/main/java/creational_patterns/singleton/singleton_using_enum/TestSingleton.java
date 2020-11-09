package creational_patterns.singleton.singleton_using_enum;

public class TestSingleton {
    public static void main(String[] args) {

        // Singleton singleton = new Singleton(); // compile error (Singleton() has private access)


        Singleton singleton1111 = Singleton.INSTANCE;
        singleton1111.name = "1111";

        Singleton singleton2222 = Singleton.INSTANCE;
        singleton2222.name = "2222";


        System.out.println(singleton1111.name); // 2222      // because are the same objects
        System.out.println(singleton2222.name); // 2222
    }
}
