package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker( Warehouse warehouse) {
        this.salary = 0;
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.getCountPickedOrders();

    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (warehouse.getCountPickedOrders() >= 10000) {
            salary = this.salary + 70000;
            isPayed = true;
            System.out.println("Бонус + ЗП сборщика " + salary);
        }
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        System.out.println("Сборщик получил ЗП " + salary);
        return "Сборщик получил ЗП " + salary;
    }
}
