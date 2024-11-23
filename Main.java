public class Main {
    public static void main(String[] args) {
        // Create a News Agency (Concrete Subject)
        NewsAgency newsAgency = new NewsAgency();

        // Create Observers (Subscribers)
        Subscriber subscriber1 = new Subscriber("Jhoanna");
        Subscriber subscriber2 = new Subscriber("May");

        // Subscribe observers to the news agency
        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);

        // Publish some news
        newsAgency.publishNews("Breaking News: KATHDEN ENGAGED!?!?!");

        // Unsubscribe one observer and publish more news
        newsAgency.unsubscribe(subscriber2);
        newsAgency.publishNews("Breaking News: MOANA NOW SHOWING ON CINEMAS");
    }
}
