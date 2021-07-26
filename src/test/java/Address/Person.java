package Address;

public class Person{
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public Address getAddress(){
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress (Address address) {
        this.address = address;
    }
}
