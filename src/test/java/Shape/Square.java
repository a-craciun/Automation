package Shape;

public class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        // P = 4 * side
        return 4 * side;
    }

    @Override
    public double area() {
        // A = side * side;
       return side * side;

    }
}
