package Address;

import java.util.HashMap;

public class TestAddress {

    public static  void main(String[] args) {

        Person person1 = new Person("Dan", 35, new Address("Round Street", 5));
        Person person2 = new Person("Nichole", 25, new Address("Some street", 23));

        HashMap<Person, Integer> map = new HashMap<Person, Integer>();
        map.put(person1, 40);
        map.put(person2, 27);

        System.out.println(map.get(person1));
        System.out.println(map.get(person2));

    }
}
