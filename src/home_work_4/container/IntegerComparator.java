package home_work_4.container;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer>{

    public int compare(Integer x1, Integer x2) {
        if(x1 == null) {
            return -1;
        } else if (x2 == null) {
            return 1;
        }
        return x1 - x2;
    }
}
