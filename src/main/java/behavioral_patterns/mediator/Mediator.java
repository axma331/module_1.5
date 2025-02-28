package behavioral_patterns.mediator;

public interface Mediator {
//    void initialPayment();
//    void addItemToCart();

    void showSellerItemList(Seller seller);

    void showOrders(Buyer buyer);
}
