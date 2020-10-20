package creational_patterns.abstract_factory;

import creational_patterns.abstract_factory.store.AbstractPhoneStore;
import creational_patterns.abstract_factory.store.PhoneStore;
import creational_patterns.abstract_factory.store.PhoneStoreProducer;

public class TestAbstractFactory {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        AbstractPhoneStore store = null;

        try {
            separate(); //------

            store = PhoneStoreProducer.createFactory(PhoneStore.APPLE_STORE);   // create store
            System.out.println(store.getStoreName());                           // print store name
            separate(); //------

            store = PhoneStoreProducer.createFactory(PhoneStore.SAMSUNG_STORE);
            System.out.println(store.getStoreName());
            separate(); //------

            store = PhoneStoreProducer.createFactory(PhoneStore.TEST_STORE);
            // throw IllegalArgumentException (IPhone11 is not Samsung)

        } catch (IllegalArgumentException ex) {
            System.out.println("| " +
                    ex.fillInStackTrace() + " | " +         // stack trace of exception
                    store.getStoreName() + " store'u, " +   // name of factory
                    store.name + "'da movcud deyil");       // name of factory of factories

            separate(); //------
        }
    }

    static void separate() {
        System.out.println("------------------------");
    }
}
