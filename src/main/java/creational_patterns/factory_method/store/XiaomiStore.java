package creational_patterns.factory_method.store;

import creational_patterns.factory_method.brand.Xiaomi;
import creational_patterns.factory_method.phone.PhoneModel;


public class XiaomiStore extends PhoneStore {

    private PhoneModel phoneModel;
    private String storeName = "Xiaomi Store";

    @Override
    public Xiaomi createPhone(PhoneModel phoneModel) {
        this.phoneModel = phoneModel;
        Xiaomi phone;

        try {
            phone = (Xiaomi) phoneModel.getClazz().newInstance();
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
