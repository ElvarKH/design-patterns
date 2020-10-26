package creational_patterns.builder.builder_2;

public class MotorcycleBuilder extends VehicleBuilder {

    public MotorcycleBuilder() {
        vehicle = new Vehicle("Motorcyle");
    }

    @Override
    public void buildFrame() {
        vehicle.frame = "Motorcycle frame";
    }

    @Override
    public void buildEngine() {
        vehicle.engine = "500 cc";
    }

    @Override
    public void buildWheels() {
        vehicle.wheels = 2;
    }
}