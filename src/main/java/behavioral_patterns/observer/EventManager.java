package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager implements Publisher {
    private final List<Observer> subscribers;

    public EventManager() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notify(String event) {
        subscribers.forEach(observer -> observer.getNoticeOfEvent(event));
    }
}
