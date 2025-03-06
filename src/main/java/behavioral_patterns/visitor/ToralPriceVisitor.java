package behavioral_patterns.visitor;

public class ToralPriceVisitor implements Visitor {
    private double totalPrice;

    @Override
    public void visit(Product product) {
       totalPrice += product.price();
    }

    @Override
    public void visit(Cart cart) {
        cart.getItems().forEach(item -> totalPrice += item.price());
    }

    public ToralPriceVisitor reset() {
        totalPrice = 0;
        return this;
    }

    @Override
    public String toString() {
        return "Total price: " + totalPrice;
    }
}
