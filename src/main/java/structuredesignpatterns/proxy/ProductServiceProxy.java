package structuredesignpatterns.proxy;

public class ProductServiceProxy implements ProductService {
    private SpecificProductService productService;

    public ProductServiceProxy() {
        System.out.println("ProductServiceProxy constructed");
    }

    @Override
    public void showAllProducts() {
        System.out.println("invoking showAllProducts from ProductServiceProxy");
        System.out.println("Executed some work");
        if (productService ==null) {
            productService = new SpecificProductService();
        }
        productService.showAllProducts();
    }
}
