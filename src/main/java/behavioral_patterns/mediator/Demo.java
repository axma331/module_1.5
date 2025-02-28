package behavioral_patterns.mediator;

public class Demo {
    public static void main(String[] args) {
        Mediator placeOrder = new PlaceOrder();
        Buyer buyer = new Buyer("Mike", 1000, placeOrder);
        Seller seller = new Seller("Adidas", placeOrder);

        // Показываем список товаров продавца
        placeOrder.showSellerItemList(seller);

        // Покупатель оформляет заказ
        ((PlaceOrder) placeOrder).placeOrder(buyer, seller, "Sneakers");

        // Показываем список заказов покупателя
        buyer.showOrderList();
    }
}