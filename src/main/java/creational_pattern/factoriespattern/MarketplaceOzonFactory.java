package creational_pattern.factoriespattern;

public class MarketplaceOzon extends Marketplace {
    public MarketplaceOzon(Product product) {
        productCard = new OzonProductCard(product);
    }
}
