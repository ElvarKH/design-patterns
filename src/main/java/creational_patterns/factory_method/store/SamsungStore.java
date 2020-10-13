package creational_patterns.factory_method.store;

import creational_patterns.factory_method.brand.Samsung;
import creational_patterns.factory_method.phone.PhoneModel;


public class SamsungStore extends PhoneStore {

    private PhoneModel phoneModel;
    private String storeName = "Samsung Store";

    @Override
    public Samsung createPhone(PhoneModel model) {
        phoneModel = model;
        Samsung phone;

        try {
            phone = (Samsung) model.getClazz().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException();
        }

        return phone;
    }

    @Override
    public String getStoreName() {
        return storeName;
    }

    @Override
    public PhoneModel getPhoneModel() {
        return phoneModel;
    }
}
