package home_work_6;

import home_work_6.api.IMenuRow;
import home_work_6.api.ISelectedItem;

public class SelectedItem implements ISelectedItem {

    public SelectedItem(IMenuRow row, int count) {
        this.count = count;
        this.row = row;
    }

    private final IMenuRow row;

    private final int count;

    public IMenuRow getRow() {
        return row;
    }

    public int getCount() {
        return count;
    }
}
