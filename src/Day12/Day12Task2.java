package Day12;
import java.util.ArrayList;
import java.util.List;
public class Day12Task2 {
    public static void main(String[] args) {
        int min = 0;
        int max = 30;
        int minSecond = 300;
        int maxSecond = 350;
        List<Integer> list = new ArrayList<>();
        for (int i = min; i<=max; i++) {
            if (i%2==0)
            list.add(i);
        }
        for (int i = minSecond; i<maxSecond; i++) {
            if (i%2==0) {
                list.add(i);
            }
        }
        for (Integer x: list) {
            System.out.println(x);
        }
    }
}