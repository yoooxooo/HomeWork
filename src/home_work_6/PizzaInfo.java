package home_work_6;

import home_work_6.api.IPizzaInfo;

public class PizzaInfo implements IPizzaInfo {

    private final String name;

    private final String description;

    private final int size;

    public String toString() {
        return getName() + "\n\n   " + description + "\n\n   " + "Размер: " + getSize() + "см\n\n   ";
    }

    public PizzaInfo(String name, String description, int size) {
        this.description = description;
        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }
}
