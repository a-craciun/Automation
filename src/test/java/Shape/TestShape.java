package Shape;

public class TestShape {

    public static void main(String[] args) {

        // Square test
        double side = 5.5;
        Shape square = new Square(side);
        System.out.println("The area of square is: " + square.area());
        System.out.println("The perimeter of square is: " + square.perimeter());

        // Rectangle Test
        double width = 6; double height = 9.5;
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("The area of rectangle is: " + rectangle.area());
        System.out.println("The perimeter of rectangle is: " + rectangle.perimeter());

        // Diamond Test
        double diamondSide = 11;
        Shape diamond = new Diamond(diamondSide);
        System.out.println("The area of diamond is: " + diamond.area());
        System.out.println("The perimeter of diamond is: " + diamond.perimeter());

        // Hexagon Test
        double hexagonSide = 6;
        Shape hexagon = new Hexagon(hexagonSide);
        System.out.println("The area of hexagon is: " + hexagon.area());
        System.out.println("The perimeter of hexagon is: " + hexagon.perimeter());

        // Triangle Test
        double x = 4, y = 7, z = 9;
        Shape triangle = new Triangle(x, y, z);
        System.out.println("The area of triangle is: " + triangle.area());
        System.out.println("The perimeter of triangle is: " + triangle.perimeter());

        // Circle Test
        double radius = 10;
        Shape circle = new Circle(radius);
        System.out.println("The area of circle is: " + circle.area());
        System.out.println("The perimeter of circle is: " + circle.perimeter());

    }
}

