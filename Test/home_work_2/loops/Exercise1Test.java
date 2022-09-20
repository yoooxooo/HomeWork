package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise1Test {

    @Test
    public void factorialPossibilityChecker1() {
        Exercise1 ex = new Exercise1();
        Assertions.assertFalse(ex.factorialPossibilityChecker(36));
    }

    @Test
    public void factorialPossibilityChecker2() {
        Exercise1 ex = new Exercise1();
        Assertions.assertTrue(ex.factorialPossibilityChecker(16));
    }

    @Test
    public void factorialMaker1() {
        Exercise1 ex = new Exercise1();
        Assertions.assertEquals(120, ex.factorialMaker(5));
    }

    @Test
    public void factorialMaker2() {
        Exercise1 ex = new Exercise1();
        Assertions.assertEquals(1, ex.factorialMaker(1));
    }
}
