package creational_patterns.factory_method.store;

import creational_patterns.factory_method.brand.Samsung;
import creational_patterns.factory_method.phone.PhoneModel;
import creational_patterns.factory_method.phone.GalaxyS10;
import creational_patterns.factory_method.phone.GalaxyA51;


public class SamsungStore extends PhoneStore {
    public Samsung createPhone(PhoneModel model) {
        switch (model) {
            case GalaxyS10:
                return new GalaxyS10();

            case GalaxyA51:
                return new GalaxyA51();

            default:
                throw new IllegalArgumentException();
        }
    }
}
