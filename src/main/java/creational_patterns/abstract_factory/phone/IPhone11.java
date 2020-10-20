package creational_patterns.abstract_factory.phone;

import creational_patterns.abstract_factory.brand.Apple;

public class IPhone11 extends Apple {

    public static final String modelName = "IPhone 11";

    @Override
    public String getDisplayType() {
        return "IPS LCD";
    }

    @Override
    public int getBackCamera() {
        return 24;
    }

    @Override
    public int getFrontCamera() {
        return 12;
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
