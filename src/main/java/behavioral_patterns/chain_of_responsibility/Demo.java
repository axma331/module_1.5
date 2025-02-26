package behavioral_patterns.chain_of_responsibility;

public class Demo {
    public static void main(String[] args) {
        Order order = new Order("London", 10_000, true);

        OrdersHandler handler = OrdersHandler.combine(
                new AuthUserHandler(),
                new DestinationHandler(),
                new TotalCostOfOrderHandler()
        );

        handler.handle(order);
    }
}
