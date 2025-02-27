package behavioral_patterns.comand;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> contents = new ArrayList<>();

    public void addItem(Product item) {
        contents.add(item);
    }

    public void removeItem(Product item) {
        contents.remove(item);
    }

    public void checkout() {
        System.out.println("Checking out:");
        contents.forEach(System.out::println);
    }
}
