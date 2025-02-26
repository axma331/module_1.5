package structure_design_patterns.flyweight;

public class Demo {
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct("Laptop", 1500, "Apple", "Electronics");
        Product product7 = ProductFactory.createProduct("Smart Watch", 500, "Apple", "Electronics");
        Product product2 = ProductFactory.createProduct("Smartphone", 800, "Samsung", "Electronics");
        Product product3 = ProductFactory.createProduct("MacBook", 2000, "Apple", "Electronics");
        Product product4 = ProductFactory.createProduct("T-Shirt", 50, "Nike", "Clothing");
        Product product5 = ProductFactory.createProduct("Jeans", 100, "Levi's", "Clothing");
        Product product6 = ProductFactory.createProduct("Headphones", 200, "Sony", "Electronics");

        System.out.println(product1.getAttributes());
        System.out.println(product2.getAttributes());
        System.out.println(product3.getAttributes());
        System.out.println(product4.getAttributes());
        System.out.println(product5.getAttributes());
        System.out.println(product6.getAttributes());
        System.out.println(product7.getAttributes());

        System.out.println("Are categories shared? " +
                (product1.getAttributes().get("category").equals(product2.getAttributes().get("category"))));
        System.out.println("Are manufacturers shared? " +
                (product1.getAttributes().get("manufacturer").equals(product3.getAttributes().get("manufacturer"))));
    }
}
