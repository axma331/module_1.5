package structuredesignpatterns.decorator;

import java.util.Map;

public class ProductCardWithDiscount implements ProductCard {
    private ProductCard productCard;

    public ProductCardWithDiscount(ProductCard productCard) {
        this.productCard = productCard;
        addDiscountToProductCard();
    }

    private void addDiscountToProductCard() {
        productCard.getProductCardDetails()
                .put("discount", "25%");
    }

    @Override
    public Map<String, String> getProductCardDetails() {
        return productCard.getProductCardDetails();
    }

    @Override
    public String toString() {
        return productCard.toString();
    }
}
