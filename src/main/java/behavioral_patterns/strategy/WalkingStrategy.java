package behavioral_patterns.strategy;

public class WalkingStrategy implements DeliveryStrategy {
    @Override
    public void deliverOrder() {
        System.out.println("Delivery using a courier.");
    }
}
