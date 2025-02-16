package creational_pattern.factoriespattern;

public class Demo {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", "Powerful end slim", 500);
        ProductCard card = new WBProductCard(laptop);
        card.render();
    }
}
