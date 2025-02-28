package behavioral_patterns.mediator;

public class Seller {
    protected final String name;
    private int revenue;
    private final Mediator mediator;

    public Seller(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void addProceeds(int amount) {
        revenue += amount;
    }

    public void showQuantityOfItemsInStock() {
        mediator.showSellerItemList(this);
    }
}