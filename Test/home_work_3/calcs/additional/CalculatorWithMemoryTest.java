package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMemoryTest {

    @Test
    public void incrementCountOperation1() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
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
    public void setMemorySocket1() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.adding(2, 2);
        calc.setMemorySocket();
        Assertions.assertEquals(4, calc.getMemoryResultSocket());
    }

    @Test
    public void setMemorySocket2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.adding(2, 2);
        calc.adding(2, 2);
        calc.adding(2, 2);
        calc.adding(2, 2);
        calc.setMemorySocket();
        Assertions.assertEquals(4, calc.getMemoryCountOperationSocket());
    }

    @Test
    public void setMemorySocket3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.adding(2, 2);
        calc.setMemorySocket();
        calc.getMemoryResultSocket();
        Assertions.assertEquals(0, calc.getMemoryResultSocket());
    }

    @Test
    public void setMemorySocket4() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.adding(2, 2);
        calc.adding(2, 2);
        calc.adding(2, 2);
        calc.adding(2, 2);
        calc.setMemorySocket();
        calc.getMemoryCountOperationSocket();
        Assertions.assertEquals(0, calc.getMemoryCountOperationSocket());
    }
}
