package home_work_5;

import home_work_5.api.IStringGenerator;
import home_work_5.stringbuilders.NameBuilder;
import home_work_5.stringbuilders.NickNameBuilder;
import home_work_5.stringbuilders.RandomStringBuilder;

public class Person {
    private final String nickName;
    private final String name;
    private final String password;

    public Person(IStringGenerator nickName, IStringGenerator name, IStringGenerator pass) {
        this.nickName = nickName.getRandomString();
        this.name = name.getRandomString();
        this.password = pass.getRandomString();
    }

    public Person() {
        NickNameBuilder nickNameBuilder = new NickNameBuilder();
        this.nickName = nickNameBuilder.getNickName();
        NameBuilder nameBuilder = new NameBuilder();
        this.name = nameBuilder.getName();
        RandomStringBuilder randomStringBuilder = new RandomStringBuilder(RandomStringBuilder.getRandomLength(5, 10));
        this.password = randomStringBuilder.getRandomString();
    }

    public Person(String nickName, String name, String pass) {
        this.nickName = nickName;
        this.name = name;
        this.password = pass;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

}
