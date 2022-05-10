package Day12;
import java.util.ArrayList;
import java.util.List;
public class Day12Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(); /* создаём новый объект класса "ArrayList" и ссылаем его на переменную типа "List"
         в соответствии с Java-конвенцией; т. е. мы ссылаем только что созданный объект на интерфейс, который имплемитирован
         в данном классе (в классе "ArrayList")*/
        cars.add("Volkswagen"); // последовательно заполняем список объектами класса "String"
        cars.add("Audi");
        cars.add("Lada");
        cars.add("Toyota");
        cars.add("Ferrari");

        for (String x: cars) {
            System.out.print(x+" ");
        }
        cars.add (3, "Tesla");

        System.out.println();
        cars.remove(0); // удаляем объект класса "String", принадлежащий листу "cars" под индексом "0"

        for (String x: cars) {
            System.out.println(x);
        }
    }
}