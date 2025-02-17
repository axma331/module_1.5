package creational_pattern.builderpattern;

import creational_pattern.builderpattern.builder.OzonProductCardBuilder;
import creational_pattern.builderpattern.builder.ProductBuilder;
import creational_pattern.builderpattern.builder.ProductCardBuilder;
import creational_pattern.builderpattern.builder.WBProductCardBuilder;
import creational_pattern.builderpattern.model.Product;
import creational_pattern.builderpattern.model.ProductCard;

public class Demo {
    public static void main(String[] args) {

        ProductBuilder productBuilder = new ProductBuilder();
        DirectorBuilder.constructLaptop(productBuilder);
        Product product = productBuilder.buildProduct();
        System.out.println(product);
        System.out.println("\n=============================\n");


        ProductCardBuilder productCardBuilder;
        ProductCard productCard;

        productCardBuilder = new OzonProductCardBuilder();
        DirectorBuilder.constructLaptop(productCardBuilder);
        productCard = productCardBuilder.buildProductCard();
        System.out.println(productCard);
        System.out.println("\n=============================\n");

        productCardBuilder = new WBProductCardBuilder();
        DirectorBuilder.constructLaptop(productCardBuilder);
        productCard = productCardBuilder.buildProductCard();
        System.out.println(productCard);
    }
}
