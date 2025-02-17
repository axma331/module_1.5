package creational_pattern.factoriespattern;

public class MarketplaceWBFactory extends Marketplace {
    public MarketplaceWBFactory(Product product) {
        productCard = new WBProductCard(product);
    }
}
