package behavioral_patterns.chain_of_responsibility;

public class DestinationHandler extends OrdersHandler {
    @Override
    public boolean handle(Order order) {
        if (!"London".equals(order.toLocation())) {
            System.out.println("Destination is not correct");
            return false;
        }
        System.out.println("Destination: London");
        return handleNext(order);
    }
}
