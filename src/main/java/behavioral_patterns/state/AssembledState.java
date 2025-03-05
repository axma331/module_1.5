package behavioral_patterns.state;

public class AssembledState implements State {
    private Order context;

    public AssembledState(Order context) {
        this.context = context;
    }

    @Override
    public void addProduct() {
        context.addItem();
        if (context.isFilled()) {
            context.changeState(new PaymentState(context));
        }
    }

    @Override
    public void removeProduct() {
        context.removeItem();
        if (context.isEmpty()) {
            context.changeState(new EmptyState(context));
        }
    }

    @Override
    public void usePromotionalCode() {
        System.out.println("You used the promotional code.");
    }

    @Override
    public void payOrder() {
        System.out.println("The order is not ready for pay.");
    }

    @Override
    public void trackDelivery() {
        System.out.println("The order is not ready for delivery.");

    }
}
