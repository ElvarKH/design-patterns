package creational_patterns.factory_method;

import creational_patterns.factory_method.phone.*;
import creational_patterns.factory_method.store.SamsungStore;

public class TestFactoryMethod {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        SamsungStore store = new SamsungStore(); // create store
        separate(); //------

        try {
            GalaxyA51 galaxyA51 = (GalaxyA51) store.printProperties(PhoneModel.GALAXY_A51); // create phone
            separate(); //------

            GalaxyS10 galaxyS10 = (GalaxyS10) store.printProperties(PhoneModel.GALAXY_S10);
            separate(); //------

            Object otherModel = store.printProperties(PhoneModel.IPHONE_11);
            // throw IllegalArgumentException (IPhone11 is not Samsung)

        } catch (IllegalArgumentException ex) {
            System.out.println("| " +
                    ex.fillInStackTrace() + " | " +                        // stack trace of exception
                    "Bu modeli, " +
                    store.getStoreName() + "'da movcud deyil");            // name of store

            separate(); //------
        }
    }

    static void separate() {
        System.out.println("------------------------");
    }
}
