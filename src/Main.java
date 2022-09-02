import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Collections.sort(people, (o1, o2) -> {
            String regex = "\\P{IsAlphabetic}+";
            String[] isSplitSurname1 = o1.getSurname().split(regex);
            String[] isSplitSurname2 = o2.getSurname().split(regex);
            int maxNumberOfWordsInSurname = 3;
            if (isSplitSurname1.length > maxNumberOfWordsInSurname
                    && isSplitSurname2.length > maxNumberOfWordsInSurname) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                if (isSplitSurname1.length > isSplitSurname2.length) {
                    return 1;
                } else if (isSplitSurname1.length < isSplitSurname2.length) {
                    return -1;
                } else {
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
            }
        });

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
