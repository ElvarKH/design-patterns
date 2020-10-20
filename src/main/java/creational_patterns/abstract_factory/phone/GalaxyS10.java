package creational_patterns.abstract_factory.phone;

import creational_patterns.abstract_factory.brand.Samsung;

public class GalaxyS10 extends Samsung {

    public static final String modelName = "Galaxy S10";

    @Override
    public String getDisplayType() {
        return "Dynamic AMOLED";
    }

    @Override
    public int getBackCamera() {
        return 40;
    }

    @Override
    public int getFrontCamera() {
        return 10;
    }

    @Override
    public int getRAM() {
        return 8;
    }

    @Override
    public int getCapacity() {
        return 128;
    }
}
