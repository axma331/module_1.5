package behavioral_patterns.chain_of_responsibility;

public class AuthUserHandler extends OrdersHandler {
    @Override
    public boolean handle(Order order) {
        if (!order.isAuthUser()) {
            System.out.println("Authorization is required to proceed with the order!");
            return false;
        }
        System.out.println("The user is authorized.");
        return handleNext(order);
    }
}
