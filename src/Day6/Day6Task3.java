package Day6;

public class Day6Task3 {
    public static void main(String[] args) {
        Student s = new Student("Петров");
        Teacher teacher = new Teacher("Марина Ивановна", "Математика");
        teacher.evaluate(s);
    }
}
