package Car;

public class Car {
    private String name;
    private int cylinders;
    private  int wheels;
    private boolean engine;

    public Car (String name, int cylinders) {
    this.name = name;
    this.cylinders = cylinders;
    this.wheels = 4;
    this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() { System.out.println("Start engine on Car"); }

    public void accelerate() {
        System.out.println("Accelerate the Car");
    }

    public void brake() {
        System.out.println("Hit the brake on Car");
    }

}


