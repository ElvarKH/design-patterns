package creational_patterns.builder.builder_1;

public class TestBuilder {
    public static void main(String[] args) {

        // Without Builder
        Phone phone1 = new Phone();
        phone1.setStoreName("LenovoCenter1");
        phone1.setBrand("Lenovo");
        phone1.setModel("VibeX3");
        phone1.setPrice(449);


        // With Builder
        Phone phone2 = new Phone.Builder()
                .storeName("HonorCenter1")
                .brand("Honor")
                .model("Play4T")
                .price(189)
                .build();


        // With Builder (Immutable Product)
        ImmutablePhone phone3 = new ImmutablePhone.Builder()
                .storeName("AppleCenter1")
                .brand("Apple")
                .model("IPhone6S")
                .price(259)
                .build();


        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
