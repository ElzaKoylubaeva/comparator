import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Mikhail", "Saltikov-Shedrin", 40));
        people.add(new Person("Pavel", "Melnikov-Pecherski", 45));
        people.add(new Person("Ilya", "Melnikov-Pecherski", 30));
        people.add(new Person("Joanne Kathleen", "Rowling", 30));
        people.add(new Person("Katie Scarlett", "OHara Hamilton Kennedy Butler", 100));
        people.add(new Person("Albus Percival", "Wulfric Brian Dumbledore", 99));

        Collections.sort(people, new NobilityComparator(3));

        for (Person person : people) {
            System.out.println(person);
        }

    }
}
