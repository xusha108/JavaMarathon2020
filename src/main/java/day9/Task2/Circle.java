package day9.Task2;

public class Circle extends Figure {
    private int radius;

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    public Circle(int radius, String color) {
        super.setColor(color);
        this.radius = radius;
    }
}
