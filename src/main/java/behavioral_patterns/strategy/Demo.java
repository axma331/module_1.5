package behavioral_patterns.strategy;


public class Demo {
    public static void main(String[] args) {
        Order order = new Order();

        order.setPaymentStrategy(new PayByCardStrategy());

        order.setDeliveryStrategy(new AeroDeliveryStrategy());

        order.placeOrder();

        System.out.println("-------------------");

        order.setPaymentStrategy(new PayBySBPStrategy());

        order.setDeliveryStrategy(new WalkingStrategy());

        order.placeOrder();

        System.out.println("-------------------");

        Order anotherOrder = new Order();

        anotherOrder.placeOrder();
    }
}
