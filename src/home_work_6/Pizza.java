package home_work_6;

import home_work_6.api.IPizza;

public class Pizza implements IPizza {

    private final String name;

    private final int size;

    public Pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return getName() + " - " + getSize() + "см";
    }
}
