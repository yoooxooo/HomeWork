package home_work_5.stringbuilders;

import java.util.concurrent.ThreadLocalRandom;

public class NameBuilder {

    private final RandomNameFromFileStringBuilder name1 = new RandomNameFromFileStringBuilder();
    private final RandomRusStringBuilder name2 = new RandomRusStringBuilder();
    private final RandomStringBuilder name3 = new RandomStringBuilder();

    public String getName() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder str = new StringBuilder();
        int i = rnd.nextInt(1,4);
        switch (i) {
            case 1:
                str.append(name1.getRandomString());
                break;
            case 2:
                str.append(name2.getRandomString());
                break;
            case 3:
                str.append(name3.getRandomString());
                break;
        }
        return str.toString();
    }
}
