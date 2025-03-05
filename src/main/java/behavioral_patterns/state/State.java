package behavioral_patterns.state;

public interface State {
    void addProduct();

    void removeProduct();

    void usePromotionalCode();

    void payOrder();

    void trackDelivery();

}
