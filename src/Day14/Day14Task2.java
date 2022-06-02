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
    static void printSumDigits (File f) {
        int sumOfAllElements = 0;
        File file = new File("File");
        try {
            Scanner sc = new Scanner(file);
            int[] mass = new int[10];
            for(int i = 0; i<mass.length; i++) {
                mass[i]=sc.nextInt();
                sumOfAllElements+=mass[i];
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (ArrayIndexOutOfBoundsException w) {
            System.out.println("Чисел в файле больше 4-х");
        }
        System.out.println(sumOfAllElements);
    }
}