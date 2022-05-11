/* Из изменений в этом файле: вместо нескольких циклов "for", а также цикла "foreach" теперь есть метод, который
* проходится по всем элементам динамического массива и заполянет их в соответствии с условием (условный оператор "if") */
package Day12;
import java.util.ArrayList;
import java.util.List;
public class Day12Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillNumbers(0, 30, list);
        System.out.println(list);
        fillNumbers(300, 350, list);
        System.out.println(list);
    }
    public static List<Integer> fillNumbers (int min, int max, List<Integer> list) {
        for (int i = min; i<max; i++) {
            if (i%2==0) {
                list.add(i);
            }
        }
        return list;
    }
}