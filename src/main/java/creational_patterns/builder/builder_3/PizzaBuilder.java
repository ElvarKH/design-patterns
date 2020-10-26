package creational_patterns.builder.builder_3;

// Abstract Builder
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public final Pizza getPizza() {
        return pizza;
    }

    public final void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
