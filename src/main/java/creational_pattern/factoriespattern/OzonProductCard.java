package creational_pattern.factoriespattern;

public class OzonProductCard implements ProductCard {
private final Product product;
private final int salePrice;

    public OzonProductCard(Product product) {
        this.product = product;
        salePrice = product.procurementPrice * 3;
    }

    @Override
    public void render() {
        System.out.println("Product card for Ozon");
        System.out.println(product);
        System.out.println("salePrice: "+ salePrice);
    }
}
