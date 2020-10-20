package creational_patterns.abstract_factory.phone;

import creational_patterns.abstract_factory.brand.Samsung;

public class GalaxyA51 extends Samsung {

    public static final String modelName = "Galaxy A51";

    @Override
    public String getDisplayType() {
        return "Super AMOLED";
    }

    @Override
    public int getBackCamera() {
        return 48;
    }

    @Override
    public int getFrontCamera() {
        return 32;
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
