package creational_pattern.builderpattern.model;

public record Product(String name, String description, int procurementPrice) {
    public String toString() {
        return "Product name: " + name + '\n' +
                "description: " + description + '\n' +
                "procurementPrice: " + procurementPrice;
    }
}