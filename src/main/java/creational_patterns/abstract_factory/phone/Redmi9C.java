package creational_patterns.abstract_factory.phone;

import creational_patterns.abstract_factory.brand.Xiaomi;

public class Redmi9C extends Xiaomi {

    public static final String modelName = "Redmi 9C";

    @Override
    public String getDisplayType() {
        return "IPS LCD";
    }

    @Override
    public int getBackCamera() {
        return 13;
    }

    @Override
    public int getFrontCamera() {
        return 5;
    }

    @Override
    public int getRAM() {
        return 2;
    }

    @Override
    public int getCapacity() {
        return 32;
    }
}
