package creational_patterns.factory_method.phone;

import creational_patterns.factory_method.brand.Apple;

public class IPhone11 extends Apple {
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
