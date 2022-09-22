package home_work_5.comparators;

import home_work_5.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordAndNameComparatorTest {

    @Test
    public void compare1() {
        Person man1 = new Person("Белка", "Дело", "шгнеку");
        Person man2 = new Person("Белкач", "Дело", "шгнеку");
        PasswordAndNickNameComparator cmp = new PasswordAndNickNameComparator();
        Assertions.assertTrue(0 > cmp.compare(man1, man2));
    }

    @Test
    public void compare2() {
        Person man1 = new Person("Белка", "Дело", "шгнеку");
        Person man2 = new Person("Белка", "Дело", "шгнеку");
        PasswordAndNickNameComparator cmp = new PasswordAndNickNameComparator();
        Assertions.assertEquals(0, cmp.compare(man1, man2));
    }

    @Test
    public void compare3() {
        Person man1 = new Person("Белка", "Дело", "шгнекук");
        Person man2 = new Person("Белка", "Дело", "шгнеку");
        PasswordAndNickNameComparator cmp = new PasswordAndNickNameComparator();
        Assertions.assertTrue(0 < cmp.compare(man1, man2));
    }

    @Test
    public void compare4() {
        Person man1 = new Person("Белкач", "Дело", "шгнеку");
        Person man2 = new Person("Белка", "Дело", "шгнекуr");
        PasswordAndNickNameComparator cmp = new PasswordAndNickNameComparator();
        Assertions.assertTrue(0 > cmp.compare(man1, man2));
    }
}
