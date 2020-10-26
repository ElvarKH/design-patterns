package creational_patterns.abstract_factory.store;

import creational_patterns.abstract_factory.brand.Phone;
import creational_patterns.abstract_factory.phone.PhoneModel;

public abstract class AbstractPhoneStore {

    public static final String nameOfStoreOfPhoneStores = "Shop Store Factory";

    public final Phone printProperties(PhoneModel model) throws InstantiationException, IllegalAccessException {
        System.out.println("| request: " + model); // print model

        Phone phone = createPhone(model);

        System.out.println(
                "Model: " + model.getModelName() + "\n" +
                        "Display type: " + phone.getDisplayType() + "\n" +
                        "Back camera: " + phone.getBackCamera() + " MP\n" +
                        "Front camera: " + phone.getFrontCamera() + " MP\n" +
                        "RAM: " + phone.getRAM() + " GB\n" +
                        "Capacity: " + phone.getCapacity() + " GB");

        return phone;
    }

    public abstract Phone createPhone(PhoneModel model) throws IllegalAccessException, InstantiationException;

    // store_name'i obyetkden de chagira bilmek uchun
    public abstract String getStoreName();
}
