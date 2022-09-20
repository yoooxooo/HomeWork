package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise5Test {

    @Test
    public void maxDigitFromNumber1() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals(6, ex.maxDigitFromNumber(234566));
    }

    @Test
    public void maxDigitFromNumber2() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals(0, ex.maxDigitFromNumber(0));
    }

    @Test
    public void maxDigitFromNumber3() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals(9, ex.maxDigitFromNumber(-978143567));
    }

    @Test
    public void chanceOfEven1() {
        Exercise5 ex = new Exercise5();
        Assertions.assertTrue(0 < ex.chanceOfEven());
    }

    @Test
    public void chanceOfEven2() {
        Exercise5 ex = new Exercise5();
        Assertions.assertTrue(100 > ex.chanceOfEven());
    }

    @Test
    public void evenAndOddNumber1() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("2 5", ex.evenAndOddNumber(2233333));
    }

    @Test
    public void evenAndOddNumber2() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("8 0", ex.evenAndOddNumber(22222222));
    }

    @Test
    public void evenAndOddNumber3() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("0 0", ex.evenAndOddNumber(0));
    }

    @Test
    public void evenAndOddNumber4() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("0 8", ex.evenAndOddNumber(11111111));
    }

    @Test
    public void evenAndOddNumber5() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("0 8", ex.evenAndOddNumber(-11111111));
    }

    @Test
    public void fibonachi1() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("0 1 2 3 5", ex.fibonachi(5));
    }

    @Test
    public void fibonachi2() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("0", ex.fibonachi(0));
    }

    @Test
    public void fibonachi3() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("0", ex.fibonachi(-2));
    }

    @Test
    public void fibonachi4() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("0 1 2 3 5 8 13 21 34 55", ex.fibonachi(10));
    }

    @Test
    public void sequenceOfNumbers1() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("0 2 4 6 8 10", ex.sequenceOfNumbers(0, 10, 2));
    }

    @Test
    public void sequenceOfNumbers2() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("3 6 9 12 15", ex.sequenceOfNumbers(3, 17, 3));
    }

    @Test
    public void sequenceOfNumbers3() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("0", ex.sequenceOfNumbers(0, 0, 10));
    }

    @Test
    public void sequenceOfNumbers4() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("-3 0 3 6 9 12 15", ex.sequenceOfNumbers(-3, 17, 3));
    }

    @Test
    public void numberTransormer1() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("987654321", ex.numberTransormer(123456789));
    }

    @Test
    public void numberTransormer2() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("-987654321", ex.numberTransormer(-123456789));
    }

    @Test
    public void numberTransormer3() {
        Exercise5 ex = new Exercise5();
        Assertions.assertEquals("0", ex.numberTransormer(0));
    }
}
