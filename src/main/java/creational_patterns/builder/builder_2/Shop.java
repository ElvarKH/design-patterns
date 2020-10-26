package creational_patterns.builder.builder_2;

// The "Director" class
public class Shop {

    // Builder uses a complex series of steps
    public void construct(VehicleBuilder builder) {
        builder.buildFrame();
        builder.buildEngine();
        builder.buildWheels();
    }
}
