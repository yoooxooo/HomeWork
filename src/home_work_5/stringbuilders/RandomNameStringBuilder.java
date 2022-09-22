package home_work_5.stringbuilders;

import home_work_5.api.IStringGenerator;
import home_work_5.packs.PackOfNames;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNameStringBuilder implements IStringGenerator {

    public String getRandomString() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        PackOfNames pack = new PackOfNames();
        return pack.getName(rnd.nextInt(1, 11));
    }
}
