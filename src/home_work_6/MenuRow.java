package home_work_6;

import home_work_6.api.IMenuRow;
import home_work_6.api.IPizzaInfo;

public class MenuRow implements IMenuRow {

    private final IPizzaInfo info;

    private final double price;

    public MenuRow(IPizzaInfo info, double price) {
        this.info = info;

        this.price = price;
    }

    public IPizzaInfo getInfo() {
        return info;
    }

    public double getPrice() {
        return price;
    }
}
