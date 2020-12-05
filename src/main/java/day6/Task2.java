package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Аэрофлот ", 2001,20000,5000);
        airplane.setYear(2015);
        airplane.setLength(25000);
        airplane.fillUp(150);
        airplane.fillUp(200);
        airplane.info();
    }
}
