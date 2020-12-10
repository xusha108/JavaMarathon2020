package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Worker worker1 = new Picker( warehouse1);
        Worker worker2 = new Courier( warehouse1);
        businessProcess(worker1);
        businessProcess(worker2);
        worker1.toString();
        worker2.toString();
        warehouse1.toString();


        Warehouse warehouse2 = new Warehouse();
        Worker worker3 = new Picker( warehouse2);
        Worker worker4 = new Courier( warehouse2);
        worker3.doWork();
        worker4.doWork();
        worker3.toString();
        worker4.toString();
        warehouse2.toString();
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
