package structure_design_patterns.decorator;

public class Demo {
    public static void main(String[] args) {
        Product laptop = new Laptop("Honor", "Good laptop", 10000);

        ProductCard card = new ProductCardWithDiscount(new ProductCardWithPrice(new BaseProductCard(laptop)));

        System.out.println(card.getProductCardDetails());
        System.out.println(card);


    }
}
