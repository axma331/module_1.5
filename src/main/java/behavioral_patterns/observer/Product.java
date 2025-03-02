package behavioral_patterns.observer;

public class Product implements Subscriber {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void notify(String event) {
        System.out.println("Product " + this.name + " received notify: " + event);
    }

    private void doSomething() {
        System.out.println("Product " + this.name + " do something..."  );
    }
}
