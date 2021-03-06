package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders++;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders++;
    }

    @Override
    public String toString() {
        System.out.println( "Количество собранных заказов " + countPickedOrders +
                ", количество доставленных заказов " + countDeliveredOrders);
        return  "Количество собранных заказов " + countPickedOrders +
                ", количество доставленных заказов " + countDeliveredOrders;
    }
}
