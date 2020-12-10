package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    public Courier(Warehouse warehouse) {
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        this.salary += 100;
        warehouse.getCountDeliveredOrders();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (warehouse.getCountDeliveredOrders() >= 10000) {
            salary = salary + 50000;
            isPayed = true;
            System.out.println("Бонус + ЗП курьера " + salary);
        }
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        System.out.println("Курьер получил ЗП " + salary);
        return "Курьер получил ЗП " + salary;
    }
}

