package Employee;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        if(salary < 0.0) {
            salary = 0.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setSalary(double newSalary){
        salary = newSalary;
    }

    public double getYearlySalary() {
        double yearlySalary = salary * 12;
        return yearlySalary;
    }

    public double getRaisedSalary() {
        double raise = salary * 0.1;
        double raisedYearlySalary = (salary + raise) * 12;
        return raisedYearlySalary;
    }

}
