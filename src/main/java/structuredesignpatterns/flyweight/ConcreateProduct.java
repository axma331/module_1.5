package structuredesignpatterns.flyweight;

import java.util.Map;

public class ConcreateProduct implements Product {
    private final Category category;
    private final Manufacturer manufacturer;

    private final String name;
    private final int cost;

    public ConcreateProduct(String name,int cost, Manufacturer manufacturer, Category category) {
        this.cost = cost;
        this.name = name;
        this.manufacturer = manufacturer;
        this.category = category;
        System.out.println("Creating product");
    }

    @Override
    public Map<String, String> getAttributes() {
        return Map.of(
                "name", this.name,
                "cost", String.valueOf(this.cost),
                "manufacturer", manufacturer.name(),
                "category", category.name()
        );
    }
}
