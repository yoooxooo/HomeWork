package home_work_5.packs;

import java.util.ArrayList;
import java.util.List;

public class PackOfNickNames {

    private final List<String> pack = new ArrayList<>();

    public PackOfNickNames(){
        pack.add("ЯнаСолях");
        pack.add("Чикимони_Делюга");
        pack.add("dishwasher");
        pack.add("zuuuuuuuuuuuz");
        pack.add("LFN");
        pack.add("SpiceGirl");
        pack.add("Злобный_бульбулятор");
        pack.add("ALEXANDRRRRRRRRRR");
        pack.add("Лена_Головач");
        pack.add("Сын_Маминой_Подруги");
    }

    public String getName(int index) {
        return pack.get(index);
    }
}
