package home_work_5.stringbuilders;

import java.util.concurrent.ThreadLocalRandom;

public class NickNameBuilder {

    private final RandomStringBuilder nickName1 = new RandomStringBuilder();

    private final RandomEngStringBuilder nickName2 = new RandomEngStringBuilder();

    private final RandomNickNameFromFileStringBuilder nickName3 = new RandomNickNameFromFileStringBuilder();

    public String getNickName() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder str = new StringBuilder();
        int i = rnd.nextInt(1,4);
        switch (i) {
            case 1:
                str.append(nickName1.getRandomString());
                break;
            case 2:
                str.append(nickName2.getRandomString());
                break;
            case 3:
                str.append(nickName3.getRandomString());
                break;
        }
        return str.toString();
    }
}
