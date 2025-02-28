package behavioral_patterns.mediator;

public class PlaceOrder implements Mediator {
    private StockService stockService;
    private OrderDatabase orderDatabase;

    public PlaceOrder() {
        this.orderDatabase = new OrderDatabase();
        this.stockService = new StockService(this);
    }

    @Override
    public void showSellerItemList(Seller seller) {
        stockService.showItemsBySeller(seller);
    }

    @Override
    public void showOrders(Buyer buyer) {
        orderDatabase.getBuyerOrders(buyer).forEach(System.out::println);
    }

    public void placeOrder(Buyer buyer, Seller seller, String item) {
        if (stockService.hasItem(seller, item)) {
            stockService.reserveItem(seller, buyer, item);
            if (buyer.reduceBalance(50)) {
                seller.addProceeds(50);
                changeOrderStatus(buyer, "Completed");
                stockService.deleteItem(seller, buyer);
                System.out.println("Order placed successfully: " + item);
            } else {
                stockService.restockItem(seller, buyer);
                changeOrderStatus(buyer, "Failed");
                System.out.println("Order placed failed: " + item);
            }
        } else {
            System.out.println("Item not available: " + item);
        }
    }

    public void changeOrderStatus(Buyer buyer, String status) {
        orderDatabase.changeOrderStatus(buyer, status);
    }
}
