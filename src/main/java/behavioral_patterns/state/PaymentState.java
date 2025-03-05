package behavioral_patterns.state;

public class PaymentState implements State {
    private Order context;

    public PaymentState(Order context) {
        this.context = context;
    }

    @Override
    public void addProduct() {
        System.out.println("It is impossible to add product!");
    }

    @Override
    public void removeProduct() {
        System.out.println("It is impossible to remove product!");
    }

    @Override
    public void usePromotionalCode() {
        System.out.println("It is impossible to use promotional code!");
    }

    @Override
    public void payOrder() {
        context.markAsPaid();
        System.out.println("Your order has been paid");
        context.changeState(new DeliveryState(context));
    }

    @Override
    public void trackDelivery() {
        System.out.println("It is impossible to track delivery!");
    }
}
