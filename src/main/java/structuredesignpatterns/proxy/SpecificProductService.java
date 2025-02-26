package structuredesignpatterns.proxy;

public class SpecificProductService implements ProductService {
    public SpecificProductService() {
        System.out.println("ConcreateProductService constructed");
        System.out.println("Loading big data");
    }

    @Override
    public void showAllProducts() {
        System.out.println("invoking showAllProducts from ConcreateProductService");
    }
}
