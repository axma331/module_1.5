package structuredesignpatterns.fasade;

import structuredesignpatterns.fasade.model.Product;
import structuredesignpatterns.fasade.model.SomeTypeProduct;
import structuredesignpatterns.fasade.service.CustomerManager;
import structuredesignpatterns.fasade.service.MarketplaceFacade;
import structuredesignpatterns.fasade.service.OrderManager;
import structuredesignpatterns.fasade.service.ProductManager;

public class Demo {
    public static void main(String[] args) {
        Product product = new SomeTypeProduct("Laptop", "good product", 10_000);
        ProductManager productManager = new ProductManager();
        productManager.addProduct(product);

        MarketplaceFacade facade = new MarketplaceFacade(
                new CustomerManager(),
                new OrderManager(),
                productManager
        );
        facade.startMenu();
    }
}
