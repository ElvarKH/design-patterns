package creational_patterns.factory_method.store;

import creational_patterns.factory_method.brand.Samsung;
import creational_patterns.factory_method.phone.PhoneModel;


public class SamsungStore extends PhoneStore {

    private PhoneModel phoneModel;
    private String storeName = "Samsung Store";

    @Override
    public Samsung createPhone(PhoneModel phoneModel) {
        this.phoneModel = phoneModel;
        Samsung phone;

        try {
            phone = (Samsung) phoneModel.getClazz().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException(); // Daxil edilen model, "Samsung" deyishenine menimsedile bilmirse
        }                                         // ("Samsung" class'inin subclass'i deyilse) exception at

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
