package creational_patterns.factory_method.store;

import creational_patterns.factory_method.brand.Apple;
import creational_patterns.factory_method.phone.PhoneModel;


public class AppleStore extends PhoneStore {

    private PhoneModel phoneModel;
    private String storeName = "Apple Store";

    @Override
    public Apple createPhone(PhoneModel phoneModel) {
        this.phoneModel = phoneModel;
        Apple phone;

        try {
            phone = (Apple) phoneModel.getClazz().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException(); // Daxil edilen model, "Apple" deyishenine menimsedile bilmirse
        }                                         // ("Apple" class'inin subclass'i deyilse) exception at

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
