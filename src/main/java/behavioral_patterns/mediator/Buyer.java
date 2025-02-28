package behavioral_patterns.mediator;


public class Buyer {
    private final String name;
    private int balance;
    private final Mediator mediator;

    public Buyer(String name, int balance, Mediator mediator) {
        this.name = name;
        this.balance = balance;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean reduceBalance(int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void showOrderList() {
        mediator.showOrders(this);
    }

    public void placeOrder(Seller seller, String item) {
        ((PlaceOrder) mediator).placeOrder(this, seller, item);
    }
}
