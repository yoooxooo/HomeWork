package home_work_5;

public class Person {
    private String nick;
    private String name;
    private String password;

    public Person() {
        RandomStringBuilder rb = new RandomStringBuilder();
        this.nick = rb.getRandomString(15);
        this.name = rb.getRandomString(15);
        this.password = rb.getRandomString(rb.getRandomLengthForPassword());
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }
}
