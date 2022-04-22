package Day11;
class Courier implements Worker {
    private int salary;
    private int isPayed;
    private Warehouse w;

    public Courier(int salary, int isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary=salary+100;
        w.plusDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders()==10 && isPayed==0) {
            salary+=50;
            isPayed++;
        } else if (isPayed==1) {
            System.out.println("Бонус уже был начислен!");
        } else if (w.getCountPickedOrders()<10) {
            System.out.println("Бонус пока не доступен!");
        }
    }
}
