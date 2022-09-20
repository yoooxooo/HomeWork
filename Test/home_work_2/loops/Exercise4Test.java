package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise4Test {

    @Test
    public void beforeStack1() {
        Exercise4 ex = new Exercise4();
        Assertions.assertTrue(ex.beforeStack(2) > 0);
    }

    @Test
    public void beforeStack2() {
        Exercise4 ex = new Exercise4();
        Assertions.assertEquals(0, ex.beforeStack(0));
    }

    @Test
    public void beforeStack3() {
        Exercise4 ex = new Exercise4();
        Assertions.assertEquals(1, ex.beforeStack(1));
    }

    @Test
    public void beforeStack4() {
        Exercise4 ex = new Exercise4();
        Assertions.assertEquals(-1, ex.beforeStack(-1));
    }

    @Test
    public void afterStack1() {
        Exercise4 ex = new Exercise4();
        Assertions.assertTrue(ex.afterStack(2) < 0);
    }

    @Test
    public void afterStack2() {
        Exercise4 ex = new Exercise4();
        Assertions.assertEquals(0, ex.afterStack(0));
    }

    @Test
    public void afterStack3() {
        Exercise4 ex = new Exercise4();
        Assertions.assertEquals(1, ex.afterStack(1));
    }

    @Test
    public void afterStack4() {
        Exercise4 ex = new Exercise4();
        Assertions.assertEquals(-1, ex.afterStack(-1));
    }
}
