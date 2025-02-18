package structuredesignpatterns.bridgepattern;

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Marketplace platformType;
        platformType = new OzonPlatform();
        Laptop laptop;
        laptop = new Laptop(
                "Honor x14",
                30000,
                "Not bad laptop",
                platformType,
                "Wi-Fi");

        Map<String, String> card = laptop.getProductCard();
        card.entrySet().forEach(System.out::println);
        System.out.println("\n======================\n");
        platformType = new WBPlatform();
        laptop = new Laptop(
                "Honor x14",
                30000,
                "Not bad laptop",
                platformType,
                "Wi-Fi");
        card = laptop.getProductCard();
        card.entrySet().forEach(System.out::println);

    }
}
