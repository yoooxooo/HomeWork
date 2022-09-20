package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise2Test {

    @Test
    public void numberLineToMultipliedResult1() {
        Exercise2 ex = new Exercise2();
        Assertions.assertEquals(40, ex.numberLineToMultipliedResult("1245"));
    }

    @Test
    public void numberLineToMultipliedResult2() {
        Exercise2 ex = new Exercise2();
        Assertions.assertEquals(0, ex.numberLineToMultipliedResult("01245"));
    }

    @Test
    public void notNumberOrNumber1() {
        Exercise2 ex = new Exercise2();
        Assertions.assertFalse(ex.notNumberOrNumber("01245"));
    }

    @Test
    public void notNumberOrNumber2() {
        Exercise2 ex = new Exercise2();
        Assertions.assertTrue(ex.notNumberOrNumber("q1245"));
    }

    @Test
    public void doubleOrNot1() {
        Exercise2 ex = new Exercise2();
        Assertions.assertFalse(ex.doubleOrNot("122412"));
    }

    @Test
    public void doubleOrNot2() {
        Exercise2 ex = new Exercise2();
        Assertions.assertTrue(ex.doubleOrNot("124.5"));
    }

    @Test
    public void doubleOrNot3() {
        Exercise2 ex = new Exercise2();
        Assertions.assertFalse(ex.doubleOrNot("12qw124.5"));
    }
}
