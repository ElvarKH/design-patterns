package creational_patterns.builder.builder_1;

public class Phone {
    public String brand;
    public String model;
    public Integer price;
    public String storeName;

    public Phone() {
    }

    public Phone(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.price = builder.price;
        this.storeName = builder.storeName;
    }

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
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", storeName='" + storeName + '\'' +
                '}';
    }

    public static class Builder {
        private String brand;
        private String model;
        private Integer price;
        private String storeName;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        public Builder storeName(String storeName) {
            this.storeName = storeName;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
