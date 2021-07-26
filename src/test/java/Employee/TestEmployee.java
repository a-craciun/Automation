package Employee;

public class TestEmployee{

    public static void main(String[] args) {
        Employee employee1 = new Employee("Mark", "Smith", 3000);
        Employee employee2 = new Employee("Dan", "Simpson", 4500);

        System.out.println("Yearly salary of " + employee1.getFirstName() + employee1.getLastName() + " is " + employee1.getYearlySalary());
        System.out.println("Yearly raised salary of " + employee1.getFirstName() + employee1.getLastName() + " is " + employee1.getRaisedSalary());

        System.out.println("Yearly salary of " + employee2.getFirstName() + employee2.getLastName() + " is " + employee2.getYearlySalary());
        System.out.println("Yearly raised salary of " + employee2.getFirstName() + employee2.getLastName() + " is " + employee2.getRaisedSalary());
    }
}
