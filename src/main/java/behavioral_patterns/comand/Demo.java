package behavioral_patterns.comand;

public class Demo {
    public static void main(String[] args) {
        MarketplaceUI marketplaceUI = new MarketplaceUI();
        Cart cart = new Cart();
        Product product_1 = new Product();
        Product product_2 = new Product();
        Product product_3 = new Product();
        AddToCartCommand addCommand1 = new AddToCartCommand(product_1, cart);
        AddToCartCommand addCommand2 = new AddToCartCommand(product_2, cart);
        AddToCartCommand addCommand3 = new AddToCartCommand(product_3, cart);
//        deleteFromCartCommand deleteCommand1 = new deleteFromCartCommand(product_1, cart);
//        deleteFromCartCommand deleteCommand2 = new deleteFromCartCommand(product_2, cart);
//        deleteFromCartCommand deleteCommand3 = new deleteFromCartCommand(product_3, cart);

        marketplaceUI.executeCommand(addCommand1);
        marketplaceUI.executeCommand(addCommand2);
        marketplaceUI.executeCommand(addCommand3);
        cart.checkout();

        marketplaceUI.undoLastCommand();
        cart.checkout();
        marketplaceUI.undoLastCommand();
        cart.checkout();


    }
}
