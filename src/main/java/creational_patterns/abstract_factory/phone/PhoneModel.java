package creational_patterns.abstract_factory.phone;


public enum PhoneModel {
    GALAXY_A51(GalaxyA51.class, GalaxyA51.modelName),
    GALAXY_S10(GalaxyS10.class, GalaxyS10.modelName),
    IPHONE_11(IPhone11.class, IPhone11.modelName),
    IPHONE_X(IPhoneX.class, IPhoneX.modelName),
    REDMI_9C(Redmi9C.class, Redmi9C.modelName),
    REDMI_NOTE_7(RedmiNote7.class, RedmiNote7.modelName);

    private Class clazz;
    private String modelName;

    PhoneModel(
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
