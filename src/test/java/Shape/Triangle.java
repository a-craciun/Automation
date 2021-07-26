package Shape;

public class Triangle extends Shape{
    private final double x, y, z;

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double area() {
        double s = (x + y + z) / 2;
        return Math.sqrt(s * (s - x) * (s - y) * (s - z));

    }

    @Override
    public double perimeter() {
        return x + y + z;
    }
}
