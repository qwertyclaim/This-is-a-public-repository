package Day11;
public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void plusPickedOrders(){
        countPickedOrders++;
    }

    public void plusDeliveredOrders(){
        countDeliveredOrders++;
    }

    public String toString () {
        return "Количество собранных заказов: "+countPickedOrders+"; количество доставленных заказов: "+countDeliveredOrders;
    }
}