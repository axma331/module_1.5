package creational_pattern.factoriespattern;

public class Demo {
    public static void main(String[] args) {
        Marketplace marketplace;
        Product product = new Product("Laptop", "Powerful end slim", 500);

        marketplace = new MarketplaceOzon(product);
        marketplace.render();

        System.out.println("==========================");

        marketplace = new MarketplaceWB(product);
        marketplace.render();
}}
