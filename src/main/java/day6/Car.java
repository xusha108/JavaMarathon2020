package day6;

public class Car {
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
    public void info() {
        System.out.println("Это автомобиль");
    }

     public int yearDifference(int userYear) {
        int difference=  year - userYear ;
        return difference;
    }
}