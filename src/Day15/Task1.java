package Day15;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        File f = new File("shoes.csv");
        File file = new File("missing_shoes.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] massLine = line.split(";");
                if (massLine[2].equals("0")) {
                    pw.println(line);
                }
            }
            pw.close();
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}