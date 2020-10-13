package creational_patterns.factory_method.phone;

import creational_patterns.factory_method.brand.Apple;

public class IPhoneX extends Apple {

    public static final String modelName = "IPhone X";

    @Override
    public String getDisplayType() {
        return "OLED";
    }

    @Override
    public int getBackCamera() {
        return 24;
    }

    @Override
    public int getFrontCamera() {
        return 7;
    }

    @Override
    public int getRAM() {
        return 3;
    }

    @Override
    public int getCapacity() {
        return 64;
    }
}
