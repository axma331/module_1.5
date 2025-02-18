package structuredesignpatterns.bridgepattern;

import java.util.Map;

public class Laptop extends Product {
    private String networkModule;

    public Laptop(String name, int cost, String description,
                  Marketplace marketplace, String networkModule) {
        super(name, cost, description, marketplace);
        this.networkModule = networkModule;
    }

    @Override
    public Map<String, String> getProductCard() {
        var card = super.getProductCard();
        card.put("networkModule", networkModule);
        return card;
    }
}
