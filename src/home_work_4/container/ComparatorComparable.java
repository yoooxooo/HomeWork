package home_work_4.container;

import java.util.Comparator;

public class ComparatorComparable implements Comparator<Comparable> {
    public int compare(Comparable o1, Comparable o2) {
        return o1.compareTo(o2);
    }
}
