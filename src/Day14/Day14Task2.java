package Day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class Day14Task2 {
    public static void main(String[] args) {
        File file = new File("File");
        printSumDigits(file);
    }
    static void printSumDigits(File f) {
        int sum = 0;
        Scanner sc;
        try {
            sc = new Scanner(f);
            String line = sc.nextLine();
            String[] massLine = line.split(" ");
            if (massLine.length!=10) {
                throw new IllegalArgumentException();
            }
            int[] massNumbers = new  int[massLine.length];
            for (int i = 0; i<massLine.length; i++) {
                massNumbers[i]=Integer.parseInt(massLine[i]);
                sum=massNumbers[i]+sum;
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IllegalArgumentException e) {
            System.out.println("Неккоректный входной файл!");
        }
    }
}