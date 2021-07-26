package Car;

public class Bmw extends Car {

    public Bmw(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine on BMW");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate the BMW");
    }

    @Override
    public void brake() {
        System.out.println("Hit the brake on BMW");
    }
}
