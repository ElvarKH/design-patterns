package creational_patterns.builder_1;

public class TestBuilder {
    public static void main(String[] args) {

        // Without Builder
        Phone phone1 = new Phone();
        phone1.setBrand("Lenovo");
        phone1.setModel("VibeX3");
        phone1.setPrice(449);

        System.out.println(phone1);


        // With Builder
        Phone phone2 = new Phone.Builder()
                .brand("Honor")
                .model("Play4T")
                .price(189)
                .build();

        System.out.println(phone2);


        // With Builder (Immutable Product)
        ImmutablePhone phone3 = new ImmutablePhone.Builder()
                .brand("Apple")
                .price(259)
                .build();

        System.out.println(phone3);
    }
}
