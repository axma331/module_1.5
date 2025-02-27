package structure_design_patterns.composite;

public class Laptop implements Product {
    private String name;
    private String description;
    private int price;
    private int size;

    public Laptop(String name, String description, int price, int size) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getSize() {
        return size;
    }
}
