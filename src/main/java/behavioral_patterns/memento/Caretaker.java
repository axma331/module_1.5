package behavioral_patterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {
    private Deque<Product.Snapshot> backup = new ArrayDeque<>();

    public void makeBackup(Product product) {
        backup.push(product.createSnapshot());
    }

    public void undo() {
        if (!backup.isEmpty()) {
            backup.pop().restore();
        } else {
            System.out.println("No more backups to restored.");
        }
    }
}
