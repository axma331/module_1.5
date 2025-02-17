package creational_pattern.factoriespattern;

public class MarketplaceOzonFactory extends Marketplace {
    public MarketplaceOzonFactory(Product product) {
        productCard = new OzonProductCard(product);
    }
}
