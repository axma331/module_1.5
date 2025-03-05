package behavioral_patterns.state;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private State state;
    private List<String> items;
    private int capacity;
    private boolean isPaid;
    private boolean delivered;

    public Order() {
        state = new EmptyState(this);
        items = new ArrayList<>();
        capacity = 3;
        isPaid = false;
        delivered = false;

    }

    public State getState() {
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void getItems() {
        items.forEach(System.out::println);
    }

    public void addItem() {
        items.add("Product " + getItemCount() + 1);
    }

    public void removeItem() {
        if (items.size() > 0) {
            items.remove(getItemCount() - 1);
        }
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void markAsPaid() {
        isPaid = !isPaid;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void markAsDelivered() {
        delivered = true;
    }

    public int getItemCount() {
        return items.size();
    }

    public boolean isFilled() {
        return getItemCount() == capacity;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
