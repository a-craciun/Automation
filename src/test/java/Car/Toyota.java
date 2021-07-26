package Car;

public class Toyota extends Car {

    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine on Toyota");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate the Toyota");
    }

    @Override
    public void brake() {
        System.out.println("Hit the brake on Toyota");
    }
}
