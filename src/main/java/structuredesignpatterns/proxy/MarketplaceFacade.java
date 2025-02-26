package structuredesignpatterns.proxy;

public class MarketplaceFacade {
    private ConsumerService consumerService;
    private ProductService productService;

    public MarketplaceFacade(ConsumerService consumerService, ProductService productService) {
        this.consumerService = consumerService;
        this.productService = productService;
        System.out.println("MarketplaceFacade constructed");
    }

    public void getConsumers(){
        consumerService.showAllConsumers();
    }
    public void getProducts(){
        productService.showAllProducts();
    }
}
