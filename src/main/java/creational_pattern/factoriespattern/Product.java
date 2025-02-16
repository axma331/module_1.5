package creational_pattern.factoriespattern;

public class Product {
    String name;
    String description;
    int procurementPrice;

    public Product(String name, String description, int procurementPrice) {
        this.name = name;
        this.description = description;
        this.procurementPrice = procurementPrice;
    }

    @Override
    public String toString() {
        return "Product name: " + name + '\n' +
                "description: " + description + '\n' +
                "procurementPrice: " + procurementPrice;
    }
}
