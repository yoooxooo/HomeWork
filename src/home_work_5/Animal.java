package home_work_5;

import java.util.concurrent.ThreadLocalRandom;

public class Animal {

    private int age;

    private String nick;

    public Animal() {
        RandomStringBuilder rb = new RandomStringBuilder();
        ThreadLocalRandom trd = ThreadLocalRandom.current();
        this.age = trd.nextInt(15);
        this.nick = rb.getRandomString(15);
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }
}

