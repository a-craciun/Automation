package Shape;

public class Diamond extends Shape {
    private final double diamondSide;

    public Diamond(double side) {
        this.diamondSide = side;
    }

    @Override
    public double perimeter() {
        // P = 4 * side
        return 4 * diamondSide;
    }

    @Override
    public double area() {
        // A = side * side;
        return diamondSide * diamondSide;

    }
}
