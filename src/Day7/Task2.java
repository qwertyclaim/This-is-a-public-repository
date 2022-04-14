package Day7;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random ra = new Random();
        int min = 90;
        int max = 100;
        int s = ra.nextInt(max-min)+min;

        Player one = new Player(s);
        Player two = new Player(s);
        Player three = new Player(s);
        Player four = new Player(s);
        Player five = new Player(s);
        Player six = new Player(s);
        one.info();
        System.out.println(Player.countPlayers);
        System.out.println(two.run(s));
    }
}
