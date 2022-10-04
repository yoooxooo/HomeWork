package home_work_6.ArrayLists;

import java.util.ArrayList;

public class ArrayListForPizzas<T> extends ArrayList<T> {

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("В заказе упаковано:\n");
        int j = 1;
        for (T i : this) {
            str.append(j).append(". ").append(i).append("\n");
            ++j;
        }
        return str.toString();
    }
}
