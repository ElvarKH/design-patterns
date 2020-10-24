package creational_patterns.factory_method.store;

import creational_patterns.factory_method.brand.Phone;
import creational_patterns.factory_method.brand.Samsung;
import creational_patterns.factory_method.phone.PhoneModel;


public class SamsungStore {

    private static final String storeName = "Samsung Store";

    public final Phone printProperties(PhoneModel model) throws InstantiationException, IllegalAccessException {
        System.out.println("| request: " + model); // print model

        Phone phone = createPhone(model); // createPhone() method called

        System.out.println(
                "Model: " + model.getModelName() + "\n" +
                        "Display type: " + phone.getDisplayType() + "\n" +
                        "Back camera: " + phone.getBackCamera() + " MP\n" +
                        "Front camera: " + phone.getFrontCamera() + " MP\n" +
                        "RAM: " + phone.getRAM() + " GB\n" +
                        "Capacity: " + phone.getCapacity() + " GB");

        return phone;
    }

    public Phone createPhone(PhoneModel phoneModel) throws IllegalAccessException, InstantiationException {

        Phone phone;

        try {
            phone = (Samsung) phoneModel.getClazz().newInstance();
        } catch (ClassCastException ex) {
            // Daxil edilen model, "Samsung" tipine cast edile bilmirse
            // ("Samsung" class'inin subclass'i deyilse) exception at
            throw new IllegalArgumentException();
        }

        return phone;
    }

    // store_name'i obyetkden de chagira bilmek uchun
    public String getStoreName() {
        return storeName;
    }
}
