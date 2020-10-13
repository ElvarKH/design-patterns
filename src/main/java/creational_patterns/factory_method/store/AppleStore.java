package creational_patterns.factory_method.store;

import creational_patterns.factory_method.brand.Apple;
import creational_patterns.factory_method.phone.PhoneModel;


public class AppleStore extends PhoneStore {

    private PhoneModel phoneModel = null;
    private String storeName = "Apple Store";

    @Override
    public Apple createPhone(PhoneModel model) {
        phoneModel = model;
        Apple phone;

        try {
            phone = (Apple) model.getClazz().newInstance();
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
