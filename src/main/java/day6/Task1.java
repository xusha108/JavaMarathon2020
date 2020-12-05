package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        car1.setYear(2008);
        car1.setColor("Blue");
        car1.setModel("Toyota");
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Модель: " + car1.getModel());
        car1.yearDifference(2015);

        Motorbike motorbike = new Motorbike(2015, "red", "bmw");
        motorbike.info();
        System.out.println("Color: " + motorbike.getColor());
        System.out.println("Model: " + motorbike.getModel());
        System.out.println("Year: " + motorbike.getYear());
    }
}
