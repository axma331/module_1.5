package creational_pattern.builderpattern.builder;

import creational_pattern.builderpattern.model.Product;

public class ProductBuilder implements Builder {
    private String name;
    private String description;
    private int procurementPrice;

    @Override
    public void buildName(String name) {
        this.name = name;
    }

    @Override
    public void buildDescription(String description) {
        this.description = description;
    }

    @Override
    public void buildProcurementPrice(int price) {
        this.procurementPrice = price;
    }

    public Product buildProduct() {
        return new Product(name, description, procurementPrice);
    }
}
