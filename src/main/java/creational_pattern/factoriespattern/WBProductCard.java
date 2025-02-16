package creational_pattern.factoriespattern;

public class WBProductCard implements ProductCard {
    private final Product product;
    private final int salePrice;

    public WBProductCard(Product product) {
        this.product = product;
        salePrice = product.procurementPrice * 2;
    }

    @Override
    public void render() {
        System.out.println("Product card for WB");
        System.out.println(product);
        System.out.println("salePrice: " + salePrice);
    }
}
