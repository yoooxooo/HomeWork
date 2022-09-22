package home_work_5;

import home_work_5.api.IStringGenerator;
import home_work_5.stringbuilders.RandomStringBuilder;

import java.util.concurrent.ThreadLocalRandom;

public class Animal {

    private final int age;

    private final String nick;

    public Animal(IStringGenerator nick) {
        RandomStringBuilder rb = new RandomStringBuilder();
        ThreadLocalRandom trd = ThreadLocalRandom.current();
        this.age = trd.nextInt(1, 16);
        this.nick = nick.getRandomString();
    }

    public Animal(String nick, int age) {
        this.age = age;
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }
}

