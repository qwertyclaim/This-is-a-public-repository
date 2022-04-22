package Day11;
public class Picker implements Worker {
    private int salary;
    private int isPayed;
    private Warehouse w;

    public Picker(int salary, int isPayed, Warehouse w) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    public void plusIsPayed () {
        salary=salary+70;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", w=" + w +
                '}';
    }

    @Override
    public void doWork() {
        salary=salary+80;
        w.plusPickedOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders()==10 && isPayed==0) {
            salary+=70;
            isPayed++;
        } else if (isPayed==1) {
            System.out.println("Бонус уже был начислен!");
        } else if (w.getCountPickedOrders()<10) {
            System.out.println("Бонус пока не доступен!");
        }
    }
}