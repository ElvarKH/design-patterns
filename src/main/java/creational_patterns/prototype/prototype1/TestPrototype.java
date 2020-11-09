package creational_patterns.prototype.prototype1;

public class TestPrototype {
    public static void main(String[] args) {

        IPrototype obj1 = new ConcretePrototype1();
        IPrototype obj2 = (ConcretePrototype1) obj1.clone();

        IPrototype obj3 = new ConcretePrototype2();
        IPrototype obj4 = (ConcretePrototype2) obj3.clone();

        System.out.println("1. " + obj1);
        System.out.println("2. " + obj2 + "\n");
        System.out.println("3. " + obj3);
        System.out.println("4. " + obj4);

        System.out.println("\n| " +
                "CLONED OBJECTS ARE DIFFERENT OBJECTS " +
                "OF THE SAME TYPE AS THE ORIGINAL |\n");
    }
}
