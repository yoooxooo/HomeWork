package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathExtendsTest {

    @Test
    public void adding1() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(2, calc.adding(1, 1));
    }

    @Test
    public void adding2() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0, calc.adding(-1, 1));
    }

    @Test
    public void adding3() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(1, calc.adding(0, 1));
    }

    @Test
    public void subtraction1() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0, calc.subtraction(1, 1));
    }

    @Test
    public void subtraction2() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(-2, calc.subtraction(-1, 1));
    }

    @Test
    public void subtraction3() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(-1, calc.subtraction(0, 1));
    }

    @Test
    public void multiplication1() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(1, calc.multiplication(1, 1));
    }

    @Test
    public void multiplication2() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(10, calc.multiplication(2, 5));
    }

    @Test
    public void multiplication3() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0, calc.multiplication(0, 1));
    }

    @Test
    public void multiplication4() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(-10, calc.multiplication(5, -2));
    }

    @Test
    public void division1() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(10, calc.division(100, 10));
    }

    @Test
    public void division2() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(10, calc.division(10, 1));
    }

    @Test
    public void division3() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0, calc.division(10, 0));
    }

    @Test
    public void division4() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(-10, calc.division(100, -10));
    }

    @Test
    public void division5() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0, calc.division(0, -10));
    }

    @Test
    public void squareRoot1() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0, calc.squareRoot(-16));
    }

    @Test
    public void squareRoot2() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0, calc.squareRoot(0));
    }

    @Test
    public void squareRoot3() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(4, calc.squareRoot(16));
    }

    @Test
    public void module1() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(16, calc.module(-16));
    }

    @Test
    public void module2() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0, calc.module(0));
    }

    @Test
    public void module3() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(16, calc.module(16));
    }

    @Test
    public void degree1() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(16, calc.degree(2, 4));
    }

    @Test
    public void degree2() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0, calc.degree(0, 2));
    }

    @Test
    public void degree3() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0.25, calc.degree(2, -2));
    }

    @Test
    public void degree4() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(1, calc.degree(16, 0));
    }
}
