package Shape;

public class Rectangle extends Shape {
    private final double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        // A = width * height;
        return width * height;
    }

    @Override
    public double perimeter() {
        // P = 2 * (width + height)
        return 2 * (width + height);
    }
}
