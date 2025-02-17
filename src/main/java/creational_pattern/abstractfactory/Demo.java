package creational_pattern.abstractfactory;

import creational_pattern.abstractfactory.factory.BrandProductsFactory;
import creational_pattern.abstractfactory.factory.impl.HonorProductsFactory;
import creational_pattern.abstractfactory.factory.impl.HuaweiProductsFactory;
import creational_pattern.abstractfactory.service.Marketplace;

public class Demo {
    public static void main(String[] args) {
        Marketplace marketplace;
        BrandProductsFactory honorProducts = new HonorProductsFactory();
        BrandProductsFactory huaweiProducts = new HuaweiProductsFactory();

        marketplace = new Marketplace(honorProducts);
        marketplace.showProducts();
        System.out.println("\n============================\n");
        marketplace = new Marketplace(huaweiProducts);
        marketplace.showProducts();

    }
}
