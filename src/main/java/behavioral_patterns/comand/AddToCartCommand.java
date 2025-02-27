package behavioral_patterns.comand;

public class AddToCartCommand implements Command {
    private final Cart cart;
    private final Product item;

    public AddToCartCommand(Product item, Cart cart) {
        this.item = item;
        this.cart = cart;
    }

    @Override
    public void execute() {
        cart.addItem(item);
        System.out.println("Added item to cart: " + item);
    }

    @Override
    public void undo() {
        cart.removeItem(item);
        System.out.println("Undo adding item to cart:  " + item);
    }
}
