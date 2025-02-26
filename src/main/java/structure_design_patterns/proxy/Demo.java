package structure_design_patterns.proxy;


public class Demo {
    public static void main(String[] args) {
        MarketplaceFacade market = new MarketplaceFacade(
//                new SpecificConsumerService(),
//                new SpecificProductService()
                new ConsumerServiceProxy(),
                new ProductServiceProxy()
        );

        market.getConsumers();
        market.getProducts();
    }
}
