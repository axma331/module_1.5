package behavioral_patterns.strategy;

public class PayByCardStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment using a card.");
    }
}
