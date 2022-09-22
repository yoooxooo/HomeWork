package home_work_5.comparators;

import home_work_5.Person;

import java.util.Comparator;

public class PasswordAndNickNameComparator implements Comparator<Person> {

    private final NameComparator nameComparator = new NameComparator();

    private final PasswordComparator passwordComparator = new PasswordComparator();

    public int compare(Person man1, Person man2) {
        if (passwordComparator.compare(man1.getPassword(), man2.getPassword()) > 0) {
            return 1;
        } else if (passwordComparator.compare(man1.getPassword(), man2.getPassword()) < 0) {
            return -1;
        } else {
            return Integer.compare(nameComparator.compare(man1.getNickName(), man2.getNickName()), 0);
        }
    }
}
