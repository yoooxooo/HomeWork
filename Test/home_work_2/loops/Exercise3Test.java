package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise3Test {

    @Test
    public void negativeOrNot1() {
        Exercise3 ex = new Exercise3();
        Assertions.assertTrue(ex.negativeOrNot("-133"));
    }

    @Test
    public void negativeOrNot2() {
        Exercise3 ex = new Exercise3();
        Assertions.assertFalse(ex.negativeOrNot("133"));
    }

    @Test
    public void negativeOrNot3() {
        Exercise3 ex = new Exercise3();
        Assertions.assertFalse(ex.negativeOrNot("0"));
    }

    @Test
    public void negativeOrNot4() {
        Exercise3 ex = new Exercise3();
        Assertions.assertFalse(ex.negativeOrNot("gd"));
    }

    @Test
    public void notIntOrInt1() {
        Exercise3 ex = new Exercise3();
        Assertions.assertTrue(ex.notIntOrInt("21.21"));
    }

    @Test
    public void notIntOrInt2() {
        Exercise3 ex = new Exercise3();
        Assertions.assertFalse(ex.notIntOrInt("2121"));
    }

    @Test
    public void notIntOrInt3() {
        Exercise3 ex = new Exercise3();
        Assertions.assertTrue(ex.notIntOrInt("er"));
    }

    @Test
    public void degreeMaker1() {
        Exercise3 ex = new Exercise3();
        Assertions.assertEquals(25, ex.degreeMaker("5", "2"));
    }

    @Test
    public void degreeMaker2() {
        Exercise3 ex = new Exercise3();
        Assertions.assertEquals(0, ex.degreeMaker("0", "2"));
    }

    @Test
    public void degreeMaker3() {
        Exercise3 ex = new Exercise3();
        Assertions.assertEquals(1, ex.degreeMaker("5", "0"));
    }

    @Test
    public void degreeMaker4() {
        Exercise3 ex = new Exercise3();
        Assertions.assertEquals(0, ex.degreeMaker("ads", "2"));
    }

    @Test
    public void degreeMaker5() {
        Exercise3 ex = new Exercise3();
        Assertions.assertEquals(0, ex.degreeMaker("5", "dfs"));
    }

    @Test
    public void degreeMaker6() {
        Exercise3 ex = new Exercise3();
        Assertions.assertEquals(30.25, ex.degreeMaker("5.5", "2"));
    }
}
