package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(-15);
        car1.setColor("Blue");
        car1.setModel("Toyota");
        System.out.println("Год выпуска: " + car1.getYear());
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Модель: " + car1.getModel());
    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int userYear) {
        if (userYear < 0) {
            System.out.println("Введите правильный год выпуска машины");
        } else {
            year = userYear;
        }
    }

    public int getYear() {
        return year;
    }

    public void setColor(String userColor) {
        if (userColor.isEmpty()) {
            System.out.println("Заполните поле");
        } else {
            color = userColor;
        }
    }

    public String getColor() {
        return color;
    }

    public void setModel(String userModel) {
        if (userModel.isEmpty()) {
            System.out.println("Заполните поле");
        } else {
            model = userModel;
        }
    }
    public String getModel() {
        return model;
    }
}