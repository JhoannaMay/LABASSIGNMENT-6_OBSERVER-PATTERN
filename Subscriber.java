// ConcreteObserver (Subscriber) class
public class Subscriber implements ClientObserver {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " has received the news: " + news);
    }
}
