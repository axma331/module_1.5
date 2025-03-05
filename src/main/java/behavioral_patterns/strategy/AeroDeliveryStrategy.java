package behavioral_patterns.strategy;

public class AeroDeliveryStrategy implements DeliveryStrategy {
    @Override
    public void deliverOrder() {
        System.out.println("Delivery using the airline.");
    }
}
