package home_work_final.comparators;

import java.util.Comparator;
import java.util.Map;

public class AmountComparator implements Comparator<Map.Entry<String, Integer>> {
    /**
     * сравнивает пары Map по величине значения и сортирует от большего к меньшему
     * @param o1 первая пара
     * @param o2 вторая пара
     * @return >0 если значение второй пары больше, 0 если значения равны, <0 если значение второй пары меньше
     */
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue() - o1.getValue();
    }
}
