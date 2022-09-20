package home_work_5;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Person mike = new Person();

        System.out.println(dog.getNick());

        System.out.println(mike.getName());
        System.out.println(mike.getNick());

        Person am1 = new Person();

        Person am2 = new Person();

        System.out.println((int)am2.getNick().charAt(0));
        System.out.println((int)am1.getNick().charAt(0));

        PasswordAndNameComparator passwordAndNameComparator = new PasswordAndNameComparator();

        System.out.println(passwordAndNameComparator.compare(am1, am2));
    }
}
