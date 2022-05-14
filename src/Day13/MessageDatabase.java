package Day13;
import java.util.ArrayList;
import java.util.List;
class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void addNewMessage (Message message) {
        messages.add(message);
    }

    public static List<Message> getMessages() {
         return (messages);
    }

    public static void showDialog (User u1, User u2) {
        for (int i = 0; i<messages.size(); i++) {
            if (messages.get(i).getSender().getUsername().equals(u1.getUsername())&messages.get(i).getReceiver().getUsername().equals(u2.getUsername())) {
                System.out.println(messages.get(i).getText());
            } else if (messages.get(i).getSender().getUsername().equals(u2.getUsername())&messages.get(i).getReceiver().getUsername().equals(u1.getUsername())) {
                System.out.println(messages.get(i).getText());
            }
        }
    }
}