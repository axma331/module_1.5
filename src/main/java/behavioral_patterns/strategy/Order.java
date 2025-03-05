package behavioral_patterns.strategy;

public class Order {
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;

    public void placeOrder() {
        if (paymentStrategy != null && deliveryStrategy != null) {

            deliveryStrategy.deliverOrder();
            paymentStrategy.pay();
            System.out.println("Order placed!");
        } else  {
            System.out.println("To place order, you need to select a delivery method and payment method!");
        }
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
}
