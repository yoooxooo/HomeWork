package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise2_4Test {

    private final int[] pack = new int[]{2, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private final int[] pack1 = new int[]{1, 1, 1, 1, 1};
    private final int[] pack2 = new int[]{2, 3, 2, 1, 1};
    private final int[] pack3 = new int[]{221, 334, 212, 112, 123};

    @Test
    public void evenSumm1() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals(32, ex.evenSumm(pack));
    }

    @Test
    public void evenSumm2() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals(0, ex.evenSumm(pack1));
    }

    @Test
    public void maximalEvenIndex1() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals(10, ex.maximalEvenIndex(pack));
    }

    @Test
    public void maximalEvenIndex2() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals(0, ex.maximalEvenIndex(pack1));
    }

    @Test
    public void lessThanAverage1() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals("2 2 3 4 5 ", ex.lessThanAverage(pack));
    }

    @Test
    public void lessThanAverage2() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals("", ex.lessThanAverage(pack1));
    }

    @Test
    public void twoSmallestArrayElements1() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals("2 2", ex.twoSmallestArrayElements(pack));
    }

    @Test
    public void twoSmallestArrayElements2() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals("1 1", ex.twoSmallestArrayElements(pack2));
    }

    @Test
    public void compressArray1() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals("2 2 9 10 0 0 0 0 0 0 ", ex.compressArray(pack, 3, 8));
    }

    @Test
    public void compressArray2() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals("3 0 0 0 0 ", ex.compressArray(pack2, 1, 2));
    }

    @Test
    public void sumOfArrayDigits1() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals(47, ex.sumOfArrayDigits(pack));
    }

    @Test
    public void sumOfArrayDigits2() {
        Exercise2_4 ex = new Exercise2_4();
        Assertions.assertEquals(30, ex.sumOfArrayDigits(pack3));
    }
}
