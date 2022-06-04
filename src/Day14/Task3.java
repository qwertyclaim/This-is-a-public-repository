package Day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        File file = new File("People");
        System.out.println(parseFileToObjList(file));
    }
    public static List<Human> parseFileToObjList(File f) {
        List<Human> people = new ArrayList<>();
        Human h;
        Scanner sc;
        try {
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] massLine = line.split(" ");
                if (Integer.parseInt(massLine[1])<0) {
                    throw new IllegalArgumentException();
                }
                h = new Human(massLine[0], Integer.parseInt(massLine[1]));
                people.add(h);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IllegalArgumentException e) {
            System.out.println("Неккоректный входной файл!");
        }
        return people;
    }
}