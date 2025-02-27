package behavioral_patterns.comand;

public class deleteFromCartCommand implements Command {
    private final Cart cart;
    private final Product item;

    public deleteFromCartCommand(Product item, Cart cart) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        cart.removeItem(item);
        System.out.println("Cart item has been deleted " + item);
    }

    @Override
    public void undo() {
        cart.addItem(item);
        System.out.println("Cart item has been added: " + item);
    }
}
