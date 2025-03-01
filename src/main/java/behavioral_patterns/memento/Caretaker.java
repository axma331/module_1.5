package behavioral_patterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Caretaker {
    private Map<Product, Deque<Product.Snapshot>> backup = new HashMap<>();

    public void makeBackup(Product product) {
        backup.computeIfAbsent(product, k -> new ArrayDeque<>()).push(product.createSnapshot());
    }

    public void undo(Product product) {
        if (backup.containsKey(product)) {
            Deque<Product.Snapshot> stack = backup.get(product);
            if (!stack.isEmpty()) {
                stack.pop().restore();
            }
        } else {
            System.out.println("No more backups to restored.");
        }
    }
}
