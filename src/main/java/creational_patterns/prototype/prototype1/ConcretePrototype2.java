package creational_patterns.prototype.prototype1;

public class ConcretePrototype2 implements IPrototype {

    @Override
    public Object clone() {
        return new ConcretePrototype2();
    }
}
