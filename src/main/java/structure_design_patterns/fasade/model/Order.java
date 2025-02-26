package structure_design_patterns.fasade.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private int id;
    private int customerId;
    private String fromLocation;
    private String toLocation;
    private OrderStatus status;


    public Order(Product product,int customerId, int id, String fromLocation, String toLocation, OrderStatus status) {
        products = new ArrayList<>(List.of(product));
        this.customerId = customerId;
        this.id = id;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", id=" + id +
                ", customerId='" + customerId + '\'' +
                ", fromLocation='" + fromLocation + '\'' +
                ", toLocation='" + toLocation + '\'' +
                ", status=" + status +
                '}';
    }
}
