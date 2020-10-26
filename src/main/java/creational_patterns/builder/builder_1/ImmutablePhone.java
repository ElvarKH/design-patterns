package creational_patterns.builder.builder_1;

public class ImmutablePhone {
    private final String brand;
    private final String model;
    private Integer price;

    private ImmutablePhone(ImmutablePhone.Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private String brand;
        private String model;
        private Integer price;

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

        public ImmutablePhone build() {
            return new ImmutablePhone(this);
        }
    }
}
