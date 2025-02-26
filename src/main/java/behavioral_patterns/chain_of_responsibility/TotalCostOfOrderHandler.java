package behavioral_patterns.chain_of_responsibility;

public class TotalCostOfOrderHandler extends OrdersHandler {
    @Override
    public boolean handle(Order order) {
        if (5_000 > order.totalPrice()) {
            System.out.println("The order total is not enough to proceed with the order!");
            return false;
        }
        System.out.println("The order total is enough to proceed with the order!");
        return handleNext(order);
    }
}
