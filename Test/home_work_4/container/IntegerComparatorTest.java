package home_work_4.container;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerComparatorTest {
    @Test
    public void compare1() {
        IntegerComparator sc = new IntegerComparator();
        Assertions.assertTrue(0 > sc.compare(1, 2));
    }

    @Test
    public void compare2() {
        IntegerComparator sc = new IntegerComparator();
        Assertions.assertEquals(0, sc.compare(121, 121));
    }

    @Test
    public void compare3() {
        IntegerComparator sc = new IntegerComparator();
        Assertions.assertTrue(0 < sc.compare(3, 1));
    }

    @Test
    public void compare4() {
        IntegerComparator sc = new IntegerComparator();
        Assertions.assertTrue(0 > sc.compare(null, 1));
    }

    @Test
    public void compare5() {
        IntegerComparator sc = new IntegerComparator();
        Assertions.assertTrue(0 < sc.compare(1, null));
    }
}
