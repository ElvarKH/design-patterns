package creational_patterns.factory_method;

import creational_patterns.factory_method.phone.PhoneModel;
import creational_patterns.factory_method.store.AppleStore;
import creational_patterns.factory_method.store.PhoneStore;
import creational_patterns.factory_method.store.SamsungStore;
import creational_patterns.factory_method.store.XiaomiStore;

public class TestFactory {
    public static void main(String[] args) {

        PhoneStore store;
        /**/ separate();

        store = new AppleStore();
        store.printProperties(PhoneModel.IPhone11);
        /**/ separate();

        store = new SamsungStore();
        store.printProperties(PhoneModel.GalaxyS10);
        /**/ separate();

        store = new XiaomiStore();
        store.printProperties(PhoneModel.IPhoneX);
        /**/ separate();
    }

    static void separate() {
        System.out.println("------------------------");
    }
}
