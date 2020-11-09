package creational_patterns.prototype.prototype1;

public class ConcretePrototype1 implements IPrototype {

    @Override
    public Object clone() {
        return new ConcretePrototype1();
    }
}
