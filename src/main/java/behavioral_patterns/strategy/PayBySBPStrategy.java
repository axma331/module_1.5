package behavioral_patterns.strategy;

public class PayBySBPStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment using a SBP.");
    }
}
