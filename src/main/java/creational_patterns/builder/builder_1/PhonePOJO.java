package creational_patterns.builder.builder_1;

public class PhonePOJO {
    public String brand;
    public String model;
    public Integer price;
    public String storeName;

    public PhonePOJO() {
    }

    public PhonePOJO(String brand) {
        this.brand = brand;
    }

    // public PhonePOJO(String model) {    // this constructor cannot be created because a constructor
    //     this.model = model;             // with one String parameter is already defined
    // }

    public PhonePOJO(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.storeName = storeName;
    }

    public PhonePOJO(int price, String brand) {
        this.price = price;
        this.storeName = storeName;
        this.brand = brand;
    }

    public PhonePOJO(String model, int price) {
        this.model = model;
        this.price = price;
        this.storeName = storeName;
    }

    public PhonePOJO(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public PhonePOJO(String brand, String model, int price, String storeName) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storeName = storeName;
    }

    // similarly, we can have hundreds of constructor combinations in complex classes,
    // so we should use builder instead

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
