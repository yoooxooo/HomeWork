package home_work_5;

import java.util.concurrent.ThreadLocalRandom;

public class RandomStringBuilder {

    public String getRandomString(int a) {
        String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; ++i) {
            int number = rnd.nextInt(61);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public int getRandomLengthForPassword() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return rnd.nextInt(5,11);
    }
}
