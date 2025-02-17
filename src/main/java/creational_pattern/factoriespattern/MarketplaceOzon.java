package creational_pattern.factoriespattern;

import java.util.Map;

public class MarketplaceOzon extends Marketplace {
    public MarketplaceOzon(Product product) {
        productCard = new OzonProductCard(product);
    }
}
