package creational_patterns.builder.builder_2;

public class TestBuilder {
    public static void main(String[] args) {

        VehicleBuilder builder;

        // Create shop with vehicle builders
        Shop shop = new Shop();

        // Construct and display vehicles
        builder = new ScooterBuilder();
        shop.construct(builder);
        builder.vehicle.show();

        builder = new CarBuilder();
        shop.construct(builder);
        builder.vehicle.show();

        builder = new MotorcycleBuilder();
        shop.construct(builder);
        builder.vehicle.show();
    }
}
