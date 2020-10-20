package creational_patterns.abstract_factory.store;

import creational_patterns.abstract_factory.brand.Apple;
import creational_patterns.abstract_factory.phone.PhoneModel;


public class AppleStore extends AbstractPhoneStore {

    private PhoneModel phoneModel;
    public static final String storeName = "Apple Store";

    @Override
    public Apple createPhone(PhoneModel phoneModel) throws IllegalAccessException, InstantiationException {
        this.phoneModel = phoneModel;

        Apple phone;

        try {
            phone = (Apple) phoneModel.getClazz().newInstance();
        } catch (ClassCastException ex) {
            // Daxil edilen model, "Apple" tipine cast edile bilmirse
            // ("Apple" class'inin subclass'i deyilse) exception at
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
