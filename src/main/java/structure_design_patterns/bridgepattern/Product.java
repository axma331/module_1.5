package structure_design_patterns.bridgepattern;

import java.util.HashMap;
import java.util.Map;

public abstract class Product {
    Marketplace marketplace;
    protected final String name;
    protected String description;
    protected final int cost;

    public Product(String name, int cost, String description,
                   Marketplace marketplace) {
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.marketplace = marketplace;
    }

    protected int getPrice() {
        return cost * marketplace.getSizeOfMarkupMultiplier();
    }

    public Map<String, String> getProductCard() {
        Map<String, String> card = new HashMap<>();
        card.put("platform", marketplace.getPlatformName());
        card.put("name", this.name);
        card.put("description", this.description);
        card.put("cost", String.valueOf(cost));
        card.put("price", String.valueOf(getPrice()));
        return card;
    }
}
