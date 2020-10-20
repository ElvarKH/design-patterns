package creational_patterns.abstract_factory.store;

import creational_patterns.abstract_factory.brand.Samsung;
import creational_patterns.abstract_factory.phone.PhoneModel;


public class SamsungStore extends AbstractPhoneStore {

    private PhoneModel phoneModel;
    public static final String storeName = "Samsung Store";

    @Override
    public Samsung createPhone(PhoneModel phoneModel) throws IllegalAccessException, InstantiationException {
        this.phoneModel = phoneModel;

        Samsung phone;

        try {
            phone = (Samsung) phoneModel.getClazz().newInstance();
        } catch (ClassCastException ex) {
            // Daxil edilen model, "Samsung" tipine cast edile bilmirse
            // ("Samsung" class'inin subclass'i deyilse) exception at
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
