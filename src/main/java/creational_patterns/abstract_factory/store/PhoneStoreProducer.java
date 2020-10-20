package creational_patterns.abstract_factory.store;

public class PhoneStoreProducer {

    public static AbstractPhoneStore createFactory(PhoneStore phoneStore) throws IllegalAccessException, InstantiationException {

        AbstractPhoneStore store;

        try {
            store = (AbstractPhoneStore) phoneStore.getClazz().newInstance();
        } catch (ClassCastException ex) {
            // Daxil edilen store, "AbstractPhoneStore" tipine cast edile bilmirse
            // ("AbstractPhoneStore" class'inin subclass'i deyilse) exception at
            throw new IllegalArgumentException();
        }

        return store;
    }
}
