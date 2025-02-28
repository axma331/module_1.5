package behavioral_patterns.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockService {
    private Map<Seller, List<String>> items;
    private Map<Buyer, Map<Seller, List<String>>> reserve;
    private final Mediator mediator;

    public StockService(Mediator mediator) {
        items = new HashMap<>();
        reserve = new HashMap<>();
        this.mediator = mediator;

        Seller adidas = new Seller("Adidas", mediator);
        Seller nike = new Seller("Nike", mediator);

        items.put(adidas, new ArrayList<>(List.of("Sneakers", "T-Shirt")));
        items.put(nike, new ArrayList<>(List.of("H&M", "Jacket")));
    }

    public void showItemsBySeller(Seller seller) {
        if (items.containsKey(seller)) {
            items.get(seller).forEach(System.out::println);
        } else {
            System.out.println("No items available for seller: " + seller.getName());
        }
    }

    public void reserveItem(Seller seller, Buyer buyer, String item) {
        items.get(seller).remove(item);
        reserve.computeIfAbsent(buyer, k -> new HashMap<>())
                .computeIfAbsent(seller, k -> new ArrayList<>())
                .add(item);
        System.out.println(buyer.getName() + " reserved: " + item + " from seller: " + seller.getName());
    }

    public void restockItem(Seller seller, Buyer buyer) {
        if (reserve.containsKey(buyer) && reserve.get(buyer).containsKey(seller)) {
            items.put(seller, reserve.get(buyer).get(seller));
            reserve.get(buyer).remove(seller);
            System.out.println("Item restocked: " + seller.getName());
        }
    }

    public void deleteItem(Seller seller, Buyer buyer) {
        if (reserve.containsKey(buyer) && reserve.get(buyer).containsKey(seller)) {
            reserve.get(buyer).remove(seller);
            if (reserve.get(buyer).isEmpty()) {
                reserve.remove(buyer);
            }
            System.out.println("Item deleted from reserve: " + seller.getName());
        }
    }

    public boolean hasItem(Seller seller, String item) {
        return items.containsKey(seller) && items.get(seller).contains(item);
    }
}
