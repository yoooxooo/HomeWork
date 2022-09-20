package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoDecoratorTest {

    @Test
    public void incrementCountOperation1() {
        CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation3() {
        CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends());
        calc.adding(1, 1);
        calc.degree(1, 1);
        calc.module(1);
        calc.division(1, 1);
        calc.multiplication(1, 1);
        calc.squareRoot(1);
        calc.subtraction(1, 1);
        Assertions.assertEquals(7, calc.getCountOperation());
    }

    @Test
    public void setMemoryCountOperationSocket1() {
        CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.setMemoryCountOperationSocket();
        Assertions.assertEquals(4, calc.getMemorySocket());
    }

    @Test
    public void getMemorySocket1() {
        CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.setMemoryCountOperationSocket();
        calc.getMemorySocket();
        Assertions.assertEquals(0, calc.getMemorySocket());

    }
}
