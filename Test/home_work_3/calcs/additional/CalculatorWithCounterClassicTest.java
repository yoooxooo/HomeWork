package home_work_3.calcs.additional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterClassicTest {

    @Test
    public void incrementCountOperation1() {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        Assertions.assertEquals(0, calc.getCountOperation());
    }
}
