package home_work_5.packs;

import java.util.ArrayList;
import java.util.List;

public class PackOfNames {

    private final List<String> pack = new ArrayList<>();

    public PackOfNames(){
        pack.add("Илья");
        pack.add("Олег");
        pack.add("Денис");
        pack.add("Владимир");
        pack.add("Захар");
        pack.add("Настя");
        pack.add("Диана");
        pack.add("Юля");
        pack.add("Ира");
        pack.add("Таня");
    }

    public String getName(int index) {
        return pack.get(index);
    }
}
