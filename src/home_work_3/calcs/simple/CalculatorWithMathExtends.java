package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public double module(double number) {
        return Math.abs(number);
    }

    public double degree(double number, int degree) {
        return Math.pow(number, degree);
    }
}
