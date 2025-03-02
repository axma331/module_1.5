package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Promotion implements Observer {
    private final List<Subscriber> subscribers;
    private String event;

    public Promotion() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String event) {
        this.event = event;
     subscribers.forEach(subscriber -> subscriber.notify(this.event));
    }
}
