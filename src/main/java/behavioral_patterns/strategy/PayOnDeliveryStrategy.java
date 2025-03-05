package behavioral_patterns.strategy;

public class PayOnDeliveryStrategy implements  PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay after getting the order.");
    }
}
