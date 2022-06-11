package Day16;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        File file = new File("file1.txt");
        File f = new File("file2.txt");
        Random ra = new Random();
        try {
            PrintWriter pw = new PrintWriter(file);
            PrintWriter ow = new PrintWriter(f);
            for (int i = 0; i<1000; i++) {
                pw.print(ra.nextInt(100)+" ");
            }
            pw.close();
            Scanner sc = new Scanner(file);
            String[] massLine = sc.nextLine().split(" ");
            int[] massNumbers = new int[massLine.length];
            int sum = 0;
            int j = 0;
            double result;
            for (int i = 0; i<massNumbers.length; i++) {
                massNumbers[i] = Integer.parseInt(massLine[i]);
                sum += massNumbers[i];
                j++;
                if (j==20) {
                    result = (double)sum/20;
                    ow.print(result + " ");
                    j = 0;
                    sum = 0;
                }
            }
            ow.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        printResult(f);
    }
    public static void printResult (File f) {
        try {
            Scanner sc = new Scanner(f);
            String[] massLine = sc.nextLine().split(" ");
            double[] massNumbers = new double[massLine.length];
            double sumOfAllNumbers = 0;
            for (int i = 0; i<massLine.length; i++) {
                massNumbers[i] = Double.parseDouble(massLine[i]);
                sumOfAllNumbers += massNumbers[i];
            }
            String result = String.format("%.0f", sumOfAllNumbers);
            System.out.println(result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}