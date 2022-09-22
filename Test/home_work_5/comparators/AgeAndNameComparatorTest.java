package home_work_5.comparators;

import home_work_5.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeAndNameComparatorTest {

    @Test
    public void compare1() {
        Animal dog1 = new Animal("Белка", 12);
        Animal dog2 = new Animal("Белкач", 12);
        AgeAndNameComparator cmp = new AgeAndNameComparator();
        Assertions.assertTrue(0 > cmp.compare(dog1, dog2));
    }

    @Test
    public void compare2() {
        Animal dog1 = new Animal("Белка", 12);
        Animal dog2 = new Animal("Белка", 12);
        AgeAndNameComparator cmp = new AgeAndNameComparator();
        Assertions.assertEquals(0, cmp.compare(dog1, dog2));
    }

    @Test
    public void compare3() {
        Animal dog1 = new Animal("Белка", 11);
        Animal dog2 = new Animal("Белка", 12);
        AgeAndNameComparator cmp = new AgeAndNameComparator();
        Assertions.assertTrue(0 > cmp.compare(dog1, dog2));
    }

    @Test
    public void compare4() {
        Animal dog1 = new Animal("Велка", 11);
        Animal dog2 = new Animal("Белка", 12);
        AgeAndNameComparator cmp = new AgeAndNameComparator();
        Assertions.assertTrue(0 > cmp.compare(dog1, dog2));
    }
}
