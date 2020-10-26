package creational_patterns.builder.builder_3;

// Diretor
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        try {
            return pizzaBuilder.getPizza();
        } catch (NullPointerException ex) {
            Exception.NO_PIZZA_BUILDER.throwException(ex);
        }

        return null;
    }

    public void constructPizza() {
        try {
            pizzaBuilder.createNewPizzaProduct();
            pizzaBuilder.buildDough();
            pizzaBuilder.buildSauce();
            pizzaBuilder.buildTopping();
        } catch (NullPointerException ex) {
            Exception.NO_PIZZA_BUILDER.throwException(ex);
        }
    }

    enum Exception {
        NO_PIZZA_BUILDER("set a builder to make pizza");

        String msg;

        void throwException(java.lang.Exception ex) {
            System.out.println(ex.fillInStackTrace() + " | " + msg);
            System.exit(1);
        }

        Exception(String msg) {
            this.msg = msg;
        }
    }
}
