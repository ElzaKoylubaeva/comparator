import java.util.Comparator;

public class NobilityComparator implements Comparator<Person> {

    public static final String WORD_SEPARATOR_REGEX = "\\P{IsAlphabetic}+";

    private final int MaxNumberOfWordsInSurname;

    public NobilityComparator(int maxNumberOfWordsInSurname) {
        this.MaxNumberOfWordsInSurname = maxNumberOfWordsInSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] isSplitSurname1 = o1.getSurname().split(WORD_SEPARATOR_REGEX);
        String[] isSplitSurname2 = o2.getSurname().split(WORD_SEPARATOR_REGEX);
        if (isSplitSurname1.length > MaxNumberOfWordsInSurname
                && isSplitSurname2.length > MaxNumberOfWordsInSurname) {
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
    }
}
