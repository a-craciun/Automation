package Car;

public class Opel extends Car {

    public Opel (String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine on Opel");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate the Opel");
    }

    @Override
    public void brake() {
        System.out.println("Hit the brake on Opel");
    }
}
