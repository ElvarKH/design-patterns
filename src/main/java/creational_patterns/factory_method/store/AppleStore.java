package creational_patterns.factory_method.store;

import creational_patterns.factory_method.brand.Apple;
import creational_patterns.factory_method.phone.PhoneModel;
import creational_patterns.factory_method.phone.IPhone11;
import creational_patterns.factory_method.phone.IPhoneX;


public class AppleStore extends PhoneStore {
    public Apple createPhone(PhoneModel model) {
        switch (model) {
            case IPhone11:
                return new IPhone11();

            case IPhoneX:
                return new IPhoneX();

            default:
                throw new IllegalArgumentException();
        }
    }
}
