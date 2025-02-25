package structuredesignpatterns.flyweight;

public class ProductFactory {
    private static final CategoryFlyweightFactory categoryPool = new CategoryFlyweightFactory();
    private static final ManufacturerFlyweightFactory manufacturerPool = new ManufacturerFlyweightFactory();

    public static Product createProduct(String productName, int cost, String manufacturerName, String categoryName) {
        Category category = categoryPool.getCategory(categoryName);
        Manufacturer manufacturer = manufacturerPool.getManufacturer(manufacturerName);

        return new ConcreateProduct(productName, cost, manufacturer, category);
    }
}
