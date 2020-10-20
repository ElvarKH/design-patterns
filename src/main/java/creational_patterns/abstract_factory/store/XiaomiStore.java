package creational_patterns.abstract_factory.store;

import creational_patterns.abstract_factory.brand.Xiaomi;
import creational_patterns.abstract_factory.phone.PhoneModel;


public class XiaomiStore extends AbstractPhoneStore {

    private PhoneModel phoneModel;
    public static final String storeName = "Xiaomi Store";

    @Override
    public Xiaomi createPhone(PhoneModel phoneModel) throws IllegalAccessException, InstantiationException {
        this.phoneModel = phoneModel;

        Xiaomi phone;

        try {
            phone = (Xiaomi) phoneModel.getClazz().newInstance();
        } catch (ClassCastException ex) {
            // Daxil edilen model, "Xiaomi" tipine cast edile bilmirse
            // ("Xiaomi" class'inin subclass'i deyilse) exception at
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
