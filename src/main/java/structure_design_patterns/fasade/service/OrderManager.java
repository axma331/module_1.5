package structure_design_patterns.fasade.service;

import structure_design_patterns.fasade.model.Order;
import structure_design_patterns.fasade.model.OrderStatus;
import structure_design_patterns.fasade.model.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private static int orderId = 0;
    private final List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public int createOrder(Product product, int customerId, String fromLocation, String toLocation) {
        Order order = new Order(product, customerId, ++orderId, fromLocation, toLocation, OrderStatus.CREATED);
        orders.add(order);
        return orderId;
    }

    public Order getOrder(int orderId) {
        return orders.stream().filter(order -> order.getId() == orderId).findFirst().orElse(null);
    }

    public void changeOrderStatus(int orderId, OrderStatus orderStatus) {
        orders.stream()
                .filter(order -> order.getId() == orderId)
                .findFirst().ifPresent(order -> {
                            order.setStatus(orderStatus);
                        }
                );
    }

    public void updatingContentsOrder(int orderId, Product product) {
        orders.stream().filter(order -> order.getId() == orderId)
                .findFirst().ifPresent(order -> order.addProduct(product));
    }

    public OrderStatus getOrderStatus(int orderId) {
        return orders.stream().filter(order -> order.getId() == orderId).findFirst().get().getStatus();
    }

    @Override
    public String toString() {
        return "OrderManager{" +
                "orders=" + orders +
                '}';
    }
}
