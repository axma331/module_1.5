package structuredesignpatterns.fasade.service;

import structuredesignpatterns.fasade.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private final List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProduct(String productName) {
        return products.stream().filter(
                product -> product.getAttributes().containsValue(productName)
        ).findFirst().orElse(null);
    }

    public void showAllProducts() {
        products.forEach(product -> System.out.println(product.getAttributes().get("name")));
    }
}
