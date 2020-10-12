package creational_patterns.factory_method.phone;

import creational_patterns.factory_method.brand.Xiaomi;

public class Redmi9C extends Xiaomi {
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
