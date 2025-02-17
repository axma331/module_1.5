package creational_pattern.factoriespattern;

public class Demo {
    public static void main(String[] args) {
        Marketplace marketplace;
        Product product = new Product("Laptop", "Powerful end slim", 500);

        marketplace = new MarketplaceOzonFactory(product);
        marketplace.render();

        System.out.println("==========================");

        marketplace = new MarketplaceWBFactory(product);
        marketplace.render();
}}
