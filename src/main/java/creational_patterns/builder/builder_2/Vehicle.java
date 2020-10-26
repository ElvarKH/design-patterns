package creational_patterns.builder.builder_2;

public class Vehicle {
    String vehicleType;
    String frame;
    String engine;
    int wheels;

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void show() {
//        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("\n------------------------");
        System.out.println("Vehicle type:  " + vehicleType);
        System.out.println("Frame: " + frame);
        System.out.println("Engine: " + engine);
        System.out.println("Wheels: " + wheels);
    }
}
