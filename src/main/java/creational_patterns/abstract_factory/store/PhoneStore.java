package creational_patterns.abstract_factory.store;

public enum PhoneStore {
    APPLE_STORE(AppleStore.class, AppleStore.storeName),
    XIAOMI_STORE(XiaomiStore.class, XiaomiStore.storeName),
    SAMSUNG_STORE(SamsungStore.class, SamsungStore.storeName),
    TEST_STORE(Object.class, "TEST");

    private Class clazz;
    private String modelName;

    PhoneStore(
            Class clazz, /* Enumdan obyekt yarada bilmek uchun */
            String modelName) {
        this.clazz = clazz;
        this.modelName = modelName;
    }

    public Class getClazz() {
        return clazz;
    }

    public String getModelName() {
        return modelName;
    }
}
