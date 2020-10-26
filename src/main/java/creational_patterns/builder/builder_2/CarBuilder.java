package creational_patterns.builder.builder_2;

public class CarBuilder extends VehicleBuilder {

    public CarBuilder() {
        vehicle = new Vehicle("Car");
    }

    @Override
    public void buildFrame() {
        vehicle.frame = "Car frame";
    }

    @Override
    public void buildEngine() {
        vehicle.engine = "2500 cc";
    }

    @Override
    public void buildWheels() {
        vehicle.wheels = 4;
    }
}