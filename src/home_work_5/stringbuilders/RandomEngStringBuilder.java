package home_work_5.stringbuilders;

import home_work_5.api.IStringGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class RandomEngStringBuilder extends RandomStringBuilder implements IStringGenerator {

    private int a = 15;

    public RandomEngStringBuilder(){}

    public RandomEngStringBuilder(int a) {
        this.a = a;
    }

    public String getRandomString() {
        String row = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a; ++i) {
            int number = rnd.nextInt(52);
            str.append(row.charAt(number));
        }
        return str.toString();
    }
}
