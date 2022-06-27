package Day19;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        File file = new File("cars");
        try {
            Scanner sc = new Scanner(file);
            Map<Integer, Point> map = new HashMap<>();
            while(sc.hasNextInt())
                map.put(sc.nextInt(), new Point(sc.nextInt(), sc.nextInt()));
            Scanner info = new Scanner(System.in);
            int x1 = info.nextInt();
            int y1 = info.nextInt();
            int x2 = info.nextInt();
            int y2 = info.nextInt();
            for (Map.Entry<Integer, Point> entry : map.entrySet()){
                if (entry.getValue().getX()>x1 && entry.getValue().getY()>y1 && entry.getValue().getX()<x2 && entry.getValue().getY()<y2)
                    System.out.println(entry.getKey());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}