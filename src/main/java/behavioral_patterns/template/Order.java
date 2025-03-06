package behavioral_patterns.template;

public abstract class Order {
    public void placeOrder(){
        payment();
        chooseWarehouse();
        chooseDeliveryMethod();
        sendNotification();
    }

    private void payment() {
        System.out.println("payment by bank card.");
    }

    private void sendNotification() {
        System.out.println("Sending notification for user.");
    }

    protected abstract void chooseWarehouse();

    protected abstract void chooseDeliveryMethod();
}
