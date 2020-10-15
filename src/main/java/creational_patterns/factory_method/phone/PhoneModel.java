package creational_patterns.factory_method.phone;


public enum PhoneModel {
    GalaxyA51(GalaxyA51.class, creational_patterns.factory_method.phone.GalaxyA51.modelName),
    GalaxyS10(GalaxyS10.class, creational_patterns.factory_method.phone.GalaxyS10.modelName),
    IPhone11(IPhone11.class, creational_patterns.factory_method.phone.IPhone11.modelName),
    IPhoneX(IPhoneX.class, creational_patterns.factory_method.phone.IPhoneX.modelName),
    Redmi9C(Redmi9C.class, creational_patterns.factory_method.phone.Redmi9C.modelName),
    RedmiNote7(RedmiNote7.class, creational_patterns.factory_method.phone.RedmiNote7.modelName);

    private Class clazz;
    private String modelName;

    PhoneModel(Class clazz, String modelName) {
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
