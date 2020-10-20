package creational_patterns.abstract_factory;

import creational_patterns.abstract_factory.phone.GalaxyS10;
import creational_patterns.abstract_factory.phone.IPhone11;
import creational_patterns.abstract_factory.phone.IPhoneX;
import creational_patterns.abstract_factory.phone.PhoneModel;
import creational_patterns.abstract_factory.store.*;

public class TestFactoryMethod {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        AbstractPhoneStore store = PhoneStoreProducer.createFactory(PhoneStore.APPLE_STORE); // create store

        try {
            separate(); //------

            IPhone11 iPhone11 = (IPhone11) store.printProperties(PhoneModel.IPHONE_11);  // create phone
            separate(); //------

            IPhoneX iPhoneX = (IPhoneX) store.printProperties(PhoneModel.IPHONE_X);
            separate(); //------

            GalaxyS10 galaxyS10 = (GalaxyS10) store.printProperties(PhoneModel.GALAXY_S10);
            // throw IllegalArgumentException (Galaxy S10 is not Apple)

        } catch (IllegalArgumentException ex) {
            System.out.println("| " +
                    ex.fillInStackTrace() + " | " +                       // stack trace of exception
                    store.getPhoneModel().getModelName() + " modeli, " +  // name of phone model
                    store.getStoreName() + "'da movcud deyil");           // name of store name

            separate(); //------
        }
    }

    static void separate() {
        System.out.println("------------------------");
    }
}
