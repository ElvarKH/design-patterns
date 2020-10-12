package creational_patterns.factory_method.store;

import creational_patterns.factory_method.phone.PhoneModel;
import creational_patterns.factory_method.brand.Xiaomi;
import creational_patterns.factory_method.phone.Redmi9C;
import creational_patterns.factory_method.phone.RedmiNote7;


public class XiaomiStore extends PhoneStore {
    public Xiaomi createPhone(PhoneModel model) {
        switch (model) {
            case Redmi9C:
                return new Redmi9C();

            case RedmiNote7:
                return new RedmiNote7();

            default:
                throw new IllegalArgumentException();
        }
    }
}
