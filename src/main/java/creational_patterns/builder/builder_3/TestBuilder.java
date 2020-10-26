package creational_patterns.builder.builder_3;

public class TestBuilder {
    public static void main(String[] args) {

        // Create Director
        Waiter waiter = new Waiter();

        // Create Builders
        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        SpicyPizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        // Construct and get hawaiian pizza
        waiter.setPizzaBuilder(hawaiianPizzaBuilder); // set hawaiian builder to director
        waiter.constructPizza();
        Pizza hawaiianPizza = waiter.getPizza();

        // Construct and get spicy pizza
        waiter.setPizzaBuilder(spicyPizzaBuilder);  // set hawaiian builder to director
        waiter.constructPizza();
        Pizza spicyPizza = waiter.getPizza();

        // print
        System.out.println(hawaiianPizza);
        System.out.println(spicyPizza);
    }
}
