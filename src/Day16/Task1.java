package Day16;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers");
        printResult(file);
    }
    static void printResult (File f) {
        try {
            Scanner sc = new Scanner(f);
            String[] massLine = sc.nextLine().split(" ");
            int[] massNumbers = new int[massLine.length];
            int sum = 0;
            for (int i = 0; i< massLine.length; i++) {
                massNumbers[i]=Integer.parseInt(massLine[i]);
                sum += massNumbers[i];
            }
            double result = (double)sum/ massNumbers.length;
            String string = String.format("%.3f", result);
            System.out.println(string);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}