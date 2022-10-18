package home_work_final.aditional;

import java.util.*;

/**
 * Переопределение toString у листа
 */
public class NewList extends ArrayList<Map.Entry<String, Integer>> {

    public NewList(Collection<Map.Entry<String, Integer>> entrySet) {
        super.addAll(entrySet);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Map.Entry<String, Integer> i : super.subList(0, size())) {
            str.append(i.getKey()).append(" - ").append(i.getValue()).append("\n");
        }
        return str.toString();
    }
}
