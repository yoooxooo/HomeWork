package home_work_5.comparators;

import home_work_5.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameComporatorTest {

    @Test
    public void compare1() {
        Animal dog1 = new Animal("Белка", 12);
        Animal dog2 = new Animal("Белкач", 12);
        NameComparator cmp = new NameComparator();
        Assertions.assertTrue(0 > cmp.compare(dog1.getNick(), dog2.getNick()));
    }

    @Test
    public void compare2() {
        Animal dog1 = new Animal("Велка", 12);
        Animal dog2 = new Animal("Белка", 12);
        NameComparator cmp = new NameComparator();
        Assertions.assertTrue(0 < cmp.compare(dog1.getNick(), dog2.getNick()));
    }

    @Test
    public void compare3() {
        Animal dog1 = new Animal("Белка", 12);
        Animal dog2 = new Animal("белка", 12);
        NameComparator cmp = new NameComparator();
        Assertions.assertTrue(0 > cmp.compare(dog1.getNick(), dog2.getNick()));
    }

    @Test
    public void compare4() {
        Animal dog1 = new Animal("Белкач", 12);
        Animal dog2 = new Animal("Белка", 12);
        NameComparator cmp = new NameComparator();
        Assertions.assertTrue(0 < cmp.compare(dog1.getNick(), dog2.getNick()));
    }

    @Test
    public void compare5() {
        Animal dog1 = new Animal("Белка", 12);
        Animal dog2 = new Animal("Велка", 12);
        NameComparator cmp = new NameComparator();
        Assertions.assertTrue(0 > cmp.compare(dog1.getNick(), dog2.getNick()));
    }

    @Test
    public void compare6() {
        Animal dog1 = new Animal("белка", 12);
        Animal dog2 = new Animal("Белка", 12);
        NameComparator cmp = new NameComparator();
        Assertions.assertTrue(0 < cmp.compare(dog1.getNick(), dog2.getNick()));
    }

    @Test
    public void compare7() {
        Animal dog1 = new Animal("Белка", 12);
        Animal dog2 = new Animal("Белка", 12);
        NameComparator cmp = new NameComparator();
        Assertions.assertEquals(0, cmp.compare(dog1.getNick(), dog2.getNick()));
    }
}
