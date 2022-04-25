package Day6;
public class Day6Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        System.out.println(car1.yearDifference(2020));
        Motorbike moto1 = new Motorbike("BMW", "Чёрный", 2018);
        moto1.info();
        System.out.println(moto1.yearDifference(2010));
    }
}
