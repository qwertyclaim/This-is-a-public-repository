package Day13;
import java.util.ArrayList;
import java.util.List;

import static Day13.MessageDatabase.*;
public class TestOfSocialMedia {

    public static void main(String[] args) {
        User user1 = new User("Иван");
        User user2 = new User("Николай");
        User user3 = new User("Константин");

        Message m1 = new Message(user1, user2, "Привет!");
        addNewMessage(m1);
        Message m2 = new Message(user1, user2, "Как дела?");
        addNewMessage(m2);
        Message m3 = new Message(user2, user1, "Привет!");
        addNewMessage(m3);
        Message m4 = new Message(user2, user1, "Да ничего, всё неплохо!");
        addNewMessage(m4);
        Message m5 = new Message(user2, user1, "Как твои успехи?");
        addNewMessage(m5);
        Message m6 = new Message(user3, user1, "Здравствуй, Ваня!");
        addNewMessage(m6);
        Message m7 = new Message(user3, user1, "Как твои успехи в освоении программирования?");
        addNewMessage(m7);
        Message m8 = new Message(user3, user1, "Надеюсь, что ты ещё не бросил))");
        addNewMessage(m8);
        Message m9 = new Message(user1, user3, "Привет, Костя!");
        addNewMessage(m9);
        Message m10 = new Message(user1, user3, "Дела у меня лучше всех!) как твои?");
        addNewMessage(m10);
        Message m11 = new Message(user1, user3, "Я уже даже записался на олимпиаду ;)");
        addNewMessage(m11);
    }
}