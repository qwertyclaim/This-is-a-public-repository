package Day13;
import java.util.ArrayList;
import java.util.List;
class User {
    private String username;
    private List<User> subscriptions;
    private List<User> friends;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
        this.friends = new ArrayList<>();
    }

    public List<User> getFriends() {
        return friends;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe (User subscriber) {
        subscriptions.add(subscriber);
    }

    public void alreadySubscribed (User subscriber) {
        for (int i = 0; i<subscriptions.size(); i++) {
            if (subscriptions.get(i).getUsername().equals(subscriber.getUsername())) {
                System.out.println("Пользователь уже подписан!");
                break;
            } else if (!subscriptions.get(i).getUsername().equals(subscriber.getUsername())) {
                subscriptions.add(subscriber);
                System.out.println("Новый подписчик!");
                break;
            }
        }
    }
    public void alreadyFriends (User subscriber) {
        for (int i = 0; i<subscriptions.size(); i++) {
            if (subscriptions.get(i).getUsername().equals(subscriber.getUsername())) {
                System.out.println("Пользователь уже в списке друзей!");
                break;
            } else if (!subscriptions.get(i).getUsername().equals(subscriber.getUsername())) {
                subscriptions.add(subscriber);
                System.out.println("Новый друг!");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return username;
    }
}