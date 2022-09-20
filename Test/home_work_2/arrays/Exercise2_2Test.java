package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise2_2Test {

    private final int[] pack = new int[]{2, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void allArrayDoWhile() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("2 2 3 4 5 6 7 8 9 10 ", ex.allArrayDoWhile(pack));
    }

    @Test
    public void allArrayWhile() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("2 2 3 4 5 6 7 8 9 10 ", ex.allArrayWhile(pack));
    }

    @Test
    public void allArrayFor() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("2 2 3 4 5 6 7 8 9 10 ", ex.allArrayFor(pack));
    }

    @Test
    public void allArrayForeach() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("2 2 3 4 5 6 7 8 9 10 ", ex.allArrayForeach(pack));
    }

    @Test
    public void secondElementsDoWhile() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("2 4 6 8 10 ", ex.secondElementsDoWhile(pack));
    }

    @Test
    public void secondElementsWhile() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("2 4 6 8 10 ", ex.secondElementsWhile(pack));
    }

    @Test
    public void secondElementsFor() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("2 4 6 8 10 ", ex.secondElementsFor(pack));
    }

    @Test
    public void secondElementsForeach() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("2 4 6 8 10 ", ex.secondElementsForeach(pack));
    }

    @Test
    public void reverseArrayDoWhile() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("10 9 8 7 6 5 4 3 2 2 ", ex.reverseArrayDoWhile(pack));
    }

    @Test
    public void reverseArrayWhile() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("10 9 8 7 6 5 4 3 2 2 ", ex.reverseArrayWhile(pack));
    }

    @Test
    public void reverseArrayFor() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("10 9 8 7 6 5 4 3 2 2 ", ex.reverseArrayFor(pack));
    }

    @Test
    public void reverseArrayForeach() {
        Exercise2_2 ex = new Exercise2_2();
        Assertions.assertEquals("10 9 8 7 6 5 4 3 2 2 ", ex.reverseArrayForeach(pack));
    }
}
