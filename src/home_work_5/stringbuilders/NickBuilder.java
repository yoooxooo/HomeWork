package home_work_5.stringbuilders;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NickBuilder {

    private final RandomStringBuilder nick1 = new RandomStringBuilder();

    private final RandomRusStringBuilder nick2 = new RandomRusStringBuilder();

    private final RandomNickFromFileStringBuilder nick3 = new RandomNickFromFileStringBuilder();

    public String getNick() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder str = new StringBuilder();
        int i = rnd.nextInt(1,4);
        switch (i) {
            case 1:
                str.append(nick1.getRandomString());
                break;
            case 2:
                str.append(nick2.getRandomString());
                break;
            case 3:
                str.append(nick3.getRandomString());
                break;
        }
        return str.toString();
    }
}
