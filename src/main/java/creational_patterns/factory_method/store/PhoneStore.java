package creational_patterns.factory_method.store;

import creational_patterns.factory_method.phone.PhoneModel;
import creational_patterns.factory_method.phone.Phone;

public abstract class PhoneStore {
    public Phone printProperties(PhoneModel model) {
        Phone phone = createPhone(model);

        System.out.println(
                "Model: " + model + "\n" +
                        "Display type: " + phone.getDisplayType() + "\n" +
                        "Back camera: " + phone.getBackCamera() + " MP\n" +
                        "Front camera: " + phone.getFrontCamera() + " MP\n" +
                        "RAM: " + phone.getRAM() + " GB\n" +
                        "Capacity: " + phone.getCapacity() + " GB"
        );

        return phone;
    }

    protected abstract Phone createPhone(PhoneModel model);
}
