package Day6;
import java.util.Random;
class Teacher {
    Random ra = new Random();
    int min = 2;
    int max = 5;
    int diff = ra.nextInt((5-2)+2);
    private String name;
    private String subject;


    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    void evaluate(Student s) {
        System.out.println("Преподаватель "+name+" оценил студента "+s.getName()+" по предмету "+subject+" на оценку "+diff);
    }
}
