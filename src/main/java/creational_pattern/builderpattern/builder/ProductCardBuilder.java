package creational_pattern.builderpattern.builder;


import creational_pattern.builderpattern.model.ProductCard;

import java.util.HashMap;
import java.util.Map;

public abstract class ProductCardBuilder implements Builder {

    protected Map<String, String> parameters = new HashMap<>();

    public ProductCard buildProductCard() {
        setMarketplaceName();
        buildSalePrice();
        return new ProductCard(parameters);
    }

    protected abstract void setMarketplaceName();

    protected abstract void buildSalePrice();
}
