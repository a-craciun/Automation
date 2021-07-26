package Shape;

public class Hexagon extends Shape{
    private final double hexagonSide;

    public Hexagon(double hexagonSide) {
        this.hexagonSide = hexagonSide;
    }

    @Override
    public double perimeter() {
        // P = 6 * side
        return 6 * hexagonSide;
    }

    @Override
    public double area() {
        return  (6*(hexagonSide * hexagonSide))/(4*Math.tan(Math.PI/6));

    }
}
