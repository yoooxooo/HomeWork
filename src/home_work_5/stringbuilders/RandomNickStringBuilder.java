package home_work_5.stringbuilders;

import home_work_5.api.IStringGenerator;
import home_work_5.packs.PackOfNicks;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNickStringBuilder implements IStringGenerator {

    public String getRandomString() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        PackOfNicks pack = new PackOfNicks();
        return pack.getName(rnd.nextInt(1, 11));
    }
}
