package behavioral_patterns.chain_of_responsibility;

public abstract class OrdersHandler {
    private OrdersHandler next;

    public static OrdersHandler combine(OrdersHandler first, OrdersHandler... nextHandlers) {
        OrdersHandler head = first;
        for (OrdersHandler handler : nextHandlers) {
            head.next = handler;
            head = handler;
        }
        return first;
    }

    public abstract boolean handle(Order order);

    protected boolean handleNext(Order order) {
        if (next == null) {
            return false;
        }
        return next.handle(order);
    }
}
