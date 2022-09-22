package home_work_5.stringbuilders;

import home_work_5.api.IStringGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class RandomStringBuilder implements IStringGenerator {

    private int a = 15;

    public RandomStringBuilder(){}

    public RandomStringBuilder(int a) {
        this.a = a;
    }

    public String getRandomString() {
        String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; ++i) {
            int number = rnd.nextInt(60);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static int getRandomLength(int fBound, int sBound) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return rnd.nextInt(fBound,sBound + 1);
    }
}
