package structuredesignpatterns.decorator;

import java.util.Map;

public class ProductCardWithPrice implements ProductCard {
    ProductCard productCard;

    public ProductCardWithPrice(ProductCard productCard) {
        this.productCard = productCard;
        addCostToProductCard();
    }

    @Override
    public Map<String, String> getProductCardDetails() {
        return productCard.getProductCardDetails();
    }

    private void addCostToProductCard() {
        var card = productCard.getProductCardDetails();

        if (card != null && card.containsKey("cost")) {
            try {
                card.put("price", String.valueOf(
                        Integer.parseInt(card.get("cost")) * 2)
                );
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return productCard.toString();
    }
}
