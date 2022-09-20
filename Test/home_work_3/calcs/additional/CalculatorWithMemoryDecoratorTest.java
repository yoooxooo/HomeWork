package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMemoryDecoratorTest {

    @Test
    public void setMemorySocket1() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.adding(2, 2);
        calc.setMemorySocket();
        Assertions.assertEquals(4, calc.getMemorySocket());
    }

    @Test
    public void setMemorySocket2() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.adding(2, 2);
        calc.setMemorySocket();
        calc.getMemorySocket();
        Assertions.assertEquals(0, calc.getMemorySocket());
    }

    @Test
    public void setMemorySocket3() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.getMemorySocket();
        Assertions.assertEquals(0, calc.getMemorySocket());
    }
}
