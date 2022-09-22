package home_work_5.packs;

import java.util.ArrayList;
import java.util.List;

public class PackOfNicks {

    private final List<String> pack = new ArrayList<>();

    public PackOfNicks(){
        pack.add("Бобик");
        pack.add("Шарик");
        pack.add("Барбос");
        pack.add("Стрелка");
        pack.add("Пинки");
        pack.add("Эйс");
        pack.add("Аксель");
        pack.add("Локи");
        pack.add("Спайк");
        pack.add("Кора");
    }

    public String getName(int index) {
        return pack.get(index);
    }
}
