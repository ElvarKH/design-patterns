package creational_patterns.builder.builder_3;

public class TestBuilder {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        SpicyPizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        // Construct and get hawaiian pizza
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        Pizza hawaiianPizza = waiter.getPizza();

        // Construct and get spicy pizza
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        Pizza spicyPizza = waiter.getPizza();

        // print
        System.out.println(hawaiianPizza);
        System.out.println(spicyPizza);
    }
}
