package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2015, "red", "Suzuki");
        System.out.println("Color: " + motorbike.getColor());
        System.out.println("Model: " + motorbike.getModel());
        System.out.println("Year: " + motorbike.getYear());
    }
}

class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
}

