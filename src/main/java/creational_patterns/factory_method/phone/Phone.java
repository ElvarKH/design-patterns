package creational_patterns.factory_method.phone;

public abstract class Phone {
    private int backCamera;
    private int frontCamera;
    private int RAM;
    private int capacity;
    private String displayType;

    public int getBackCamera() {
        return backCamera;
    }

    public int getFrontCamera() {
        return frontCamera;
    }

    public String getDisplayType() {
        return displayType;
    }

    public int getRAM() {
        return RAM;
    }

    public int getCapacity() {
        return capacity;
    }
}
