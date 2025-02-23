package structuredesignpatterns.decorator;

public class Laptop implements Product {
    String name;
    String description;
    int cost;

    public Laptop(String name, String description, int cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
