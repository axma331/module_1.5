package behavioral_patterns.observer;

public class Promotion {
    private final String name;
    private final EventManager eventManager;
    private String event;

    public Promotion(String name, EventManager eventManager) {
        this.name = name;
        this.eventManager = eventManager;
    }

    public void setEvent(String event) {
        this.event = event;
        eventManager.notify(event);
    }

    public void addSubscriber(Observer observer) {
        eventManager.subscribe(observer);
    }

    public void removeSubscriber(Observer observer) {
        eventManager.unsubscribe(observer);
    }
}
