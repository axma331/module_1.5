package creational_pattern.factoriespattern;

public class MarketplaceWB extends Marketplace {
    public MarketplaceWB(Product product) {
        productCard = new WBProductCard(product);
    }
}
