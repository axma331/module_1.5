package behavioral_patterns.state;

public class DeliveryState implements State{
    private Order context;
    private boolean flag;

    public DeliveryState(Order context) {
        this.context = context;
        this.flag = false;
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
        System.out.println("The order has already been paid!");

    }

    @Override
    public void trackDelivery() {
        if (!this.flag) {
            System.out.println("The order in the delivery process!");
            flag = true;
        } else  {
            context.markAsDelivered();
            System.out.println("The order was delivered!");
        }
    }
}
