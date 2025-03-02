package behavioral_patterns.observer;

public class Product implements Observer {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void getNoticeOfEvent(String event) {
        System.out.println("Product " + this.name + " received notify: " + event);
        doSomething();
    }

    private void doSomething() {
        System.out.println("Product " + this.name + " do something..."  );
    }
}
