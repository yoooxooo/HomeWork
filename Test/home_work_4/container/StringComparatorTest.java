package home_work_4.container;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringComparatorTest {

    @Test
    public void compare1() {
        StringComparator sc = new StringComparator();
        Assertions.assertTrue(0 > sc.compare("0", "12"));
    }

    @Test
    public void compare2() {
        StringComparator sc = new StringComparator();
        Assertions.assertEquals(0, sc.compare("0", "1"));
    }

    @Test
    public void compare3() {
        StringComparator sc = new StringComparator();
        Assertions.assertTrue(0 < sc.compare("012", "12"));
    }

    @Test
    public void compare4() {
        StringComparator sc = new StringComparator();
        Assertions.assertTrue(0 > sc.compare(null, "12"));
    }

    @Test
    public void compare5() {
        StringComparator sc = new StringComparator();
        Assertions.assertTrue(0 < sc.compare("0", null));
    }
}
