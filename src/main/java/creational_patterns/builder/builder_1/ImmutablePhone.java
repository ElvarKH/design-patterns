package creational_patterns.builder.builder_1;

public class ImmutablePhone {
    private final String brand;
    private final String model;
    private Integer price;
    private String storeName;

    private ImmutablePhone(ImmutablePhone.Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.price = builder.price;
        this.storeName = builder.storeName;
    }

    @Override
    public String toString() {
        return "ImmutablePhone{" +
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

        public ImmutablePhone.Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public ImmutablePhone.Builder model(String model) {
            this.model = model;
            return this;
        }

        public ImmutablePhone.Builder price(Integer price) {
            this.price = price;
            return this;
        }

        public ImmutablePhone.Builder storeName(String storeName) {
            this.storeName = storeName;
            return this;
        }

        public ImmutablePhone build() {
            return new ImmutablePhone(this);
        }
    }
}
