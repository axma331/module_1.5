package behavioral_patterns.visitor;

public class Demo {
    public static void main(String[] args) {
        ToralPriceVisitor totalPrice = new ToralPriceVisitor();

        Product oil = new Product("Oil",  100.0);
        Product soda = new Product("Soda",  50.0);
        Product water = new Product("Water",  40.0);

        oil.accept(totalPrice);
        System.out.println(totalPrice);
        soda.accept(totalPrice);
        System.out.println(totalPrice);
        water.accept(totalPrice);
        System.out.println(totalPrice);

        Cart cart = new Cart()
                .add(oil)
                .add(water)
                .add(soda);

        cart.accept(totalPrice.reset());
        System.out.println(totalPrice);


    }
}
