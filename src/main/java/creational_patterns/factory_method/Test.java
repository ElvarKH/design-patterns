package creational_patterns.factory_method;

import creational_patterns.factory_method.phone.*;
import creational_patterns.factory_method.store.SamsungStore;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        SamsungStore store = new SamsungStore(); // create store
        separate(); //------

        try {
            // create Samsung (Galaxy A51)
            GalaxyA51 galaxyA51 = (GalaxyA51) store.printProperties(PhoneModel.GALAXY_A51);
            separate(); //------

            // create Samsung (Galaxy S10)
            GalaxyS10 galaxyS10 = (GalaxyS10) store.printProperties(PhoneModel.GALAXY_S10);
            separate(); //------

            // create Other phone (IPhone 11)
            Object otherModel = store.printProperties(PhoneModel.IPHONE_11);
            // throw IllegalArgumentException (IPhone11 is not Samsung)

        } catch (IllegalArgumentException ex) {
            System.out.println("| " +
                    ex.fillInStackTrace() + " | " +                        // stack trace of exception
                    store.getPhoneModel().getModelName() + " modeli, " +   // name of phone model
                    store.getStoreName() + "'da movcud deyil");            // name of store

            separate(); //------
        }
    }

    static void separate() {
        System.out.println("------------------------");
    }
}
