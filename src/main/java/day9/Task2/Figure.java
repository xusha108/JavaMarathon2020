package day9.Task2;

public abstract class Figure {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();
    abstract double perimeter();

    ;
}
