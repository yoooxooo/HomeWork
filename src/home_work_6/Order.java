package home_work_6;

import home_work_6.api.IOrder;
import home_work_6.api.ISelectedItem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {

    private final List<ISelectedItem> list = new ArrayList<ISelectedItem>();

    public Order(String... names) {
        Menu menu = new Menu();
       for (String name : names) {
           for (int i = 0; i < menu.getItems().size(); ++i) {
               if(name.substring(0, name.length()-2).equals(menu.getItems().get(i).getInfo().getName())) {
                   list.add(new SelectedItem(menu.getItems().get(i), Integer.parseInt(name.substring(name.length()-1))));
               }
           }
       }
    }

    public List<ISelectedItem> getSelected() {
        return list;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Заказано:\n\n");
        for (int i = 0; i < list.size(); ++i) {
            str.append(i+1).append(". ").append(list.get(i).getRow().getInfo().getName()).append(" - ").append(list.get(i).getCount()).append("\n");
        }
        return str.toString();
    }
}
