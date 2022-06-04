package Day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        File file = new File("People");
        System.out.println(parseFileToStringList(file));
    }
    public static List<String> parseFileToStringList(File f) {
        List<String> people = new ArrayList<>();
        Scanner sc;
        try {
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                people.add(line);
                String[] massLine = line.split(" ");
                if (Integer.parseInt(massLine[1])<0)
                    throw new IllegalArgumentException();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IllegalArgumentException e) {
            System.out.println("Неккоректный входной файл!");
        }
        return people;
    }
}