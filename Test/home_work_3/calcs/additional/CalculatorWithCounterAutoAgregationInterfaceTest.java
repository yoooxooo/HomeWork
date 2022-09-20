package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoAgregationInterfaceTest {

    @Test
    public void incrementCountOperation1() {
        CalculatorWithCounterAutoChoiceAgregation calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithCounterAutoChoiceAgregation calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation3() {
        CalculatorWithCounterAutoChoiceAgregation calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
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
