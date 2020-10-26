package creational_patterns.builder.builder_2;

public class ScooterBuilder extends VehicleBuilder {

    public ScooterBuilder() {
        vehicle = new Vehicle("Scooter");
    }

    @Override
    public void buildFrame() {
        vehicle.frame = "Scooter frame";
    }

    @Override
    public void buildEngine() {
        vehicle.engine = "100 cc";
    }

    @Override
    public void buildWheels() {
        vehicle.wheels = 2;
    }
}