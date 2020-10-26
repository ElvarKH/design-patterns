package creational_patterns.builder.builder_2;

public abstract class VehicleBuilder {

    // Gets vehicle instance
    protected Vehicle vehicle;

    public Vehicle vehicle(){
        return vehicle;
    }

    // Abstract build methods
    public abstract void buildFrame();
    public abstract void buildEngine();
    public abstract void buildWheels();
}
