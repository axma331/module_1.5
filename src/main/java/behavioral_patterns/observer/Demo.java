package behavioral_patterns.observer;

public class Demo {
    public static void main(String[] args) {

        Product appleWatch = new Product("Apple watch");
        Product orangeWatch = new Product("Orange watch");
        Product pineapple = new Product("Honor laptop");

        Promotion promotion = new Promotion("March 8th", new EventManager());
        promotion.addSubscriber(appleWatch);
        promotion.setEvent("First event");
        System.out.println("----------------------------");
        promotion.addSubscriber(orangeWatch);
        promotion.addSubscriber(pineapple);
        promotion.setEvent("Second event");
        System.out.println("----------------------------");
        promotion.removeSubscriber(appleWatch);
        promotion.setEvent("Third event");
    }
}
