package home_work_6.ArrayLists;

import java.util.ArrayList;

public class ArrayListForOrderStatus<T> extends ArrayList<T> {

    public String toString() {
        StringBuilder str = new StringBuilder();
        int j = 1;
        str.append("Отчет:\n\n");
        for (T i : this) {
            str.append(j).append(": ").append(i).append("\n");
            ++j;
        }
        return str.toString();
    }
}
