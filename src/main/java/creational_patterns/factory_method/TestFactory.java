package creational_patterns.factory_method;

import creational_patterns.factory_method.brand.Phone;
import creational_patterns.factory_method.phone.*;
import creational_patterns.factory_method.store.AppleStore;
import creational_patterns.factory_method.store.PhoneStore;
import creational_patterns.factory_method.store.SamsungStore;
import creational_patterns.factory_method.store.XiaomiStore;

public class TestFactory {
    public static void main(String[] args) {

        PhoneStore store = null;

        try {
            separate();//////

            store = new AppleStore();
            IPhone11 iPhone11 = (IPhone11) store.printProperties(PhoneModel.IPhone11);
            separate();//////

            store = new SamsungStore();
            GalaxyS10 galaxyS10 = (GalaxyS10) store.printProperties(PhoneModel.GalaxyS10);
            separate();//////

            store = new XiaomiStore();
            // throw IllegalArgumentException - chunki, store deyisheni RedmiStore obyekti saxlayir
            IPhoneX iPhoneX = (IPhoneX) store.printProperties(PhoneModel.IPhoneX);
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
