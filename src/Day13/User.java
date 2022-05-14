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

    public void alreadySubscribed (User subscriber, List<User> subscription) {
        for (int i = 0; i<subscription.size(); i++) {
            if (subscriber.getSubscriptions().equals(subscriber.getUsername()) == true) {
                System.out.println(subscriber.getUsername()+" уже подписан!");
            } else {
                subscriber.getSubscriptions().add(subscriber);
                System.out.println(subscriber.getUsername()+" подписался!");
            }
        }
    }
    public void alreadyFriends (User friendly, List<User> friend) {
        for (int i = 0; i<friend.size(); i++) {
            if (friendly.getFriends().equals(friendly.getUsername())==true) {
                System.out.println(friendly.getUsername()+" уже в списке друзей!");
            } else {
                friendly.getFriends().add(friendly);
                System.out.println(friendly.getUsername()+" добавлен в список друзей!");
            }
        }
    }

    @Override
    public String toString() {
        return username;
    }
}