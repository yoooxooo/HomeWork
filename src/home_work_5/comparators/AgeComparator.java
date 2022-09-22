package home_work_5.comparators;

import java.util.Comparator;

public class AgeComparator implements Comparator<Integer> {

    public int compare(Integer age1, Integer age2) {
        return age1 - age2;
    }
}
