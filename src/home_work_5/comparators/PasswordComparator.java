package home_work_5.comparators;

import java.util.Comparator;

public class PasswordComparator implements Comparator<String> {

    public int compare(String name1, String name2) {
        if(name1 == null) {
            return -1;
        } else if (name2 == null) {
            return 1;
        }
        return Integer.compare(name1.length(), name2.length());

    }
}
