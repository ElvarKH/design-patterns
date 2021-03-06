package creational_patterns.factory_method.phone;

public enum PhoneModel {
    GALAXY_A51(GalaxyA51.class, GalaxyA51.modelName),
    GALAXY_S10(GalaxyS10.class, GalaxyS10.modelName),
    IPHONE_11(Object.class, IPhone11.modelName);

    private Class clazz;
    private String modelName;

    PhoneModel(Class clazz /* Enumdan obyekt yarada bilmek uchun */,
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
