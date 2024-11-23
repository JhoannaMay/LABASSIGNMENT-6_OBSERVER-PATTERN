import java.util.ArrayList;
import java.util.List;

// ConcreteSubject (NewsAgency) class
public class NewsAgency implements SubscribeSubject {
    private List<ClientObserver> observers = new ArrayList<>();
    private String latestNews;

    @Override
    public void subscribe(ClientObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(ClientObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ClientObserver observer : observers) {
            observer.update(latestNews);
        }
    }

    // Method to update the news and notify observers
    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("News Agency: Publishing news - " + news);
        notifyObservers(); // Notify all observers about the new news
    }
}
