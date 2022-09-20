package home_work_5;

public class PasswordAndNameComparator {

    private final NameComparator nameComparator = new NameComparator();

    private final PasswordComparator passwordComparator = new PasswordComparator();

    public int compare(Person man1, Person man2) {
        String pass1 = man1.getPassword();
        String pass2 = man2.getPassword();
        String name1 = man1.getNick();
        String name2 = man2.getNick();
        if (passwordComparator.compare(pass1, pass2) > 0) {
            return 1;
        } else if (passwordComparator.compare(pass1, pass2) < 0) {
            return -1;
        } else {
            return Integer.compare(nameComparator.compare(name1, name2), 0);
        }
    }
}
