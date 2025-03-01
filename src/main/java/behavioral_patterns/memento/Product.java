package behavioral_patterns.memento;

public class Product {
    private String name;
    private String description;
    private int cost;
    private int price;
    private String manufacturer;

    public Product(String name, String description, int cost, int price, String manufacturer) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this, name, cost, price, manufacturer, description);
    }

    public void restore(Snapshot snapshot) {
        if (snapshot != null) snapshot.restore();
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "name: " + name + ',' +
                " description: " + description + ',' +
                " cost: " + cost + ',' +
                " price: " + price + ',' +
                " manufacturer: " + manufacturer;
    }

    public record Snapshot(Product product, String name, int cost, int price, String manufacturer,
                           String description) {
        public void restore() {
            product.setName(name);
            product.setCost(cost);
            product.setPrice(price);
            product.setManufacturer(manufacturer);
            product.setDescription(description);
        }
    }
}
