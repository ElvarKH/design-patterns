package creational_patterns.factory_method;

import creational_patterns.factory_method.brand.Phone;
import creational_patterns.factory_method.phone.PhoneModel;
import creational_patterns.factory_method.store.AppleStore;
import creational_patterns.factory_method.store.PhoneStore;
import creational_patterns.factory_method.store.SamsungStore;
import creational_patterns.factory_method.store.XiaomiStore;

public class TestFactory {
    public static void main(String[] args) {

        PhoneStore store = null;
        Phone phone = null;

        try {
            separate();//////

            store = new AppleStore();
            phone = store.printProperties(PhoneModel.IPhone11);
            separate();//////

            store = new SamsungStore();
            phone = store.printProperties(PhoneModel.GalaxyS10);
            separate();//////

            store = new XiaomiStore();
            phone = store.printProperties(PhoneModel.Redmi9C);
            separate();//////

            phone = store.printProperties(PhoneModel.IPhoneX); // throw IllegalArgumentException
            separate();//////

        } catch (IllegalArgumentException ex) {
            System.err.println(
                    ex.fillInStackTrace() + " | " +
                            store.getPhoneModel().getModelName() + " modeli, " +
                            store.getStoreName() + "'da movcud deyil");
        }
    }

    static void separate() {
        System.out.println("------------------------");
    }
}
