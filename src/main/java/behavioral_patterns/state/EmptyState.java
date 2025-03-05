package behavioral_patterns.state;

public class EmptyState implements State {
    private Order context;

    public EmptyState(Order order) {
        context = order;
    }

    @Override
    public void addProduct() {
        context.addItem();
        context.changeState(new AssembledState(context));
    }

    @Override
    public void removeProduct() {
        System.out.println("the order cart is empty: " + context.getItemCount() + " items.");
    }

    @Override
    public void usePromotionalCode() {
        System.out.println("To used the promotional code, add the product!");
    }

    @Override
    public void payOrder() {
        System.out.println("For paid, add the product!");
    }

    @Override
    public void trackDelivery() {
        System.out.println("To track the delivery, add the product and pay for it!");
    }
}
