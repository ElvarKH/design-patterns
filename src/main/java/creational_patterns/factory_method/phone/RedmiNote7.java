package creational_patterns.factory_method.phone;

import creational_patterns.factory_method.brand.Xiaomi;

public class RedmiNote7 extends Xiaomi {
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
