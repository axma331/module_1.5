package structure_design_patterns.fasade;

import structure_design_patterns.fasade.model.Product;
import structure_design_patterns.fasade.model.SomeTypeProduct;
import structure_design_patterns.fasade.service.CustomerManager;
import structure_design_patterns.fasade.service.MarketplaceFacade;
import structure_design_patterns.fasade.service.OrderManager;
import structure_design_patterns.fasade.service.ProductManager;

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
