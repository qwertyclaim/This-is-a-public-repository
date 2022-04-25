package Day6;
public class Day6Task2 {
    public static void main(String[] args) {
        Aircraft aircraft1 = new Aircraft("Airbus", 2010, 40, 2500, 0);
        aircraft1.setYear(2015);
        aircraft1.setLength(60);
        System.out.println(aircraft1.fillUp(10));
        System.out.println(aircraft1.fillUp(15));
        aircraft1.info();
    }
}
