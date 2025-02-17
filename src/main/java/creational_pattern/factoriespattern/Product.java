package creational_pattern.factoriespattern;

public class Product {
    private final String name;
    private String description;
    private final int procurementPrice;

    public Product(String name, String description, int procurementPrice) {
        this.name = name;
        this.description = description;
        this.procurementPrice = procurementPrice;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getProcurementPrice() {
        return procurementPrice;
    }

    @Override
    public String toString() {
        return "Product name: " + name + '\n' +
                "description: " + description + '\n' +
                "procurementPrice: " + procurementPrice;
    }
}
