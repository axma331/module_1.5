package creational_pattern.factoriespattern;

import java.util.HashMap;
import java.util.Map;

public class WBProductCard implements ProductCard {
    private final Product product;
    private final Map<String, String> card;

    public WBProductCard(Product product) {
        card = new HashMap<>();
        this.product = product;
    }

    @Override
    public Map<String, String> getCard() {
        card.put("platform", "WB");
        card.put("name", product.getName());
        card.put("description", product.getDescription());
        card.put("price", String.valueOf(product.getProcurementPrice()));
        card.put("salePrice", String.valueOf(getSalePrice()));
        return card;
    }

    private int getSalePrice() {
        return product.getProcurementPrice() * 2;
    }
}
