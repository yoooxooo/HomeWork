package home_work_6;

import home_work_6.api.IMenu;
import home_work_6.api.IMenuRow;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {

    private final List<IMenuRow> list = new ArrayList<IMenuRow>();

    public Menu() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("HomeWork\\saves\\hw6\\Menu.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Файл меню не найден");
            throw new RuntimeException("Поменяйте файл Menu.txt для успешной работы");
        }
        int counter = 0;
        String buffer = null;
        try {
            while (true) {
                if ((buffer = reader.readLine()) == null) break;
                ++counter;
                String name = buffer;
                if ((buffer = reader.readLine()) == null) break;
                ++counter;
                String description = buffer;
                if ((buffer = reader.readLine()) == null) break;
                ++counter;
                description += "\n   " + buffer;
                if ((buffer = reader.readLine()) == null) break;
                ++counter;
                int size = Integer.parseInt(buffer);
                if ((buffer = reader.readLine()) == null) break;
                ++counter;
                double price = Double.parseDouble(buffer);
                list.add(new MenuRow(new PizzaInfo(name, description, size), price));
            }
            if (counter % 5 != 0) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("Параметры файла неправильно составлены");
            throw new RuntimeException("Поменяйте файл Menu.txt для успешной работы");
        } catch (NumberFormatException e) {
            System.out.println("В параметрах цены или размера пиццы допущена ошибка");
            throw new RuntimeException("Поменяйте файл Menu.txt для успешной работы");
        }
    }


    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Меню:\n\n");
        for (int i = 0; i < list.size(); ++i) {
            str.append(i+1).append(". ").append(list.get(i).getInfo()).append("Цена: ").append(list.get(i).getPrice()).append(" BYN\n\n");
        }
        return str.toString();
    }

    public List<IMenuRow> getItems() {
        return list;
    }
}
