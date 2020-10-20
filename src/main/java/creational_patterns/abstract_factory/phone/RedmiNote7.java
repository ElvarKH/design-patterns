package creational_patterns.abstract_factory.phone;

import creational_patterns.abstract_factory.brand.Xiaomi;

public class RedmiNote7 extends Xiaomi {

    public static final String modelName = "Redmi Note 7";

    @Override
    public String getDisplayType() {
        return "IPS LCD";
    }

    @Override
    public int getBackCamera() {
        return 48;
    }

    @Override
    public int getFrontCamera() {
        return 13;
    }

    @Override
    public int getRAM() {
        return 4;
    }

    @Override
    public int getCapacity() {
        return 64;
    }
}
