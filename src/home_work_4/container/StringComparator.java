package home_work_4.container;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    public int compare (String x1, String x2) {
        return x1.length() - x2.length();
    }
}
