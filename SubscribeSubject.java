// Subject interface
public interface SubscribeSubject {
    void subscribe(ClientObserver observer);
    void unsubscribe(ClientObserver observer);
    void notifyObservers();
}
