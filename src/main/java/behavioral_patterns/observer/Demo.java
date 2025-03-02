package behavioral_patterns.observer;

public class Demo {
    public static void main(String[] args) {

        Product appleWatch = new Product("Apple watch");
        Product orangeWatch = new Product("Orange watch");
        Product pineapple = new Product("Honor laptop");

        Promotion promotion = new Promotion();
        promotion.subscribe(appleWatch);
        promotion.notifySubscribers("First event");
        System.out.println("----------------------------");
        promotion.subscribe(orangeWatch);
        promotion.subscribe(pineapple);
        promotion.notifySubscribers("Second event");
        System.out.println("----------------------------");
        promotion.unsubscribe(appleWatch);
        promotion.notifySubscribers("Third event");

    }
}
