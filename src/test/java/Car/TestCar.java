package Car;

public class TestCar {

    public static void main(String[] args) {

        Opel opel = new Opel("Astra", 4);
        System.out.println("Car name is Opel " + opel.getName() + " and number of cylinders is: " + opel.getCylinders());
        opel.startEngine();
        opel.accelerate();
        opel.brake();

        Bmw bmw = new Bmw("X3", 4);
        System.out.println("Car name is BMW " + bmw.getName() + " and number of cylinders is: " + bmw.getCylinders());
        bmw.startEngine();
        bmw.accelerate();
        bmw.brake();

        Toyota toyota = new Toyota("Yaris", 2);
        System.out.println("Car name is Toyota " + toyota.getName() + " and number of cylinders is: " + toyota.getCylinders());
        toyota.startEngine();
        toyota.accelerate();
        toyota.brake();

    }

}
