package day9.Task2;

public class Rectangle extends Figure {
    private int width;
    private int height;

    @Override
    public double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return (width + height) * 2;
    }

    public Rectangle(int width, int height, String color) {
        super.setColor(color);
        this.width = width;
        this.height = height;
    }
}
