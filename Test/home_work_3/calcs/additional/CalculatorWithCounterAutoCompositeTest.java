package home_work_3.calcs.additional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoCompositeTest {

    @Test
    public void incrementCountOperation1() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(0, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation3() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.adding(1, 1);
        calc.degree(1, 1);
        calc.module(1);
        calc.division(1, 1);
        calc.multiplication(1, 1);
        calc.squareRoot(1);
        calc.subtraction(1, 1);
        Assertions.assertEquals(7, calc.getCountOperation());
    }
}
