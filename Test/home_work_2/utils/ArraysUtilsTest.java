package home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class ArraysUtilsTest {

    public boolean checkvalue(int[] arr) {
        for (int j : arr) {
            if (j == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void arrayFromConsole() {
        ArraysUtils arr = new ArraysUtils();
        int[] array = arr.arrayFromConsole(10);
        Assertions.assertTrue(checkvalue(array));
    }

    @Test
    public void arrayRandom1() {
        int[] array = arrayRandom(6, 25);
        Assertions.assertTrue(checkvalue(array));
    }
}
