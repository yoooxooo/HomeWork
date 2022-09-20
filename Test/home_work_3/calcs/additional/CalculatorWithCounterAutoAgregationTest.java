package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoAgregationTest {

    @Test
    public void incrementCountOperation1() {
        CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(new CalculatorWithCounterAutoSuper());
        calc.adding(1, 1);
        calc.adding(1, 1);
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(new CalculatorWithCounterAutoSuper());
        Assertions.assertEquals(0, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation3() {
        CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(new CalculatorWithCounterAutoSuper());
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
