package behavioral_patterns.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderDatabase {
    private final Map<Buyer, List<String>> data;
    private final Map<Buyer, String> orderStatus;

    public OrderDatabase() {
        this.data = new HashMap<>();
        this.orderStatus = new HashMap<>();
    }

    public List<String> getBuyerOrders(Buyer buyer) {
        return data.getOrDefault(buyer, new ArrayList<>());
    }

    public void addOrder(Buyer buyer, String order) {
        data.computeIfAbsent(buyer, k -> new ArrayList<>()).add(order);
    }

    public void changeOrderStatus(Buyer buyer, String status) {
        orderStatus.put(buyer, status);
        System.out.println(buyer.getName() + "`s order status changed to " + status);
    }
}