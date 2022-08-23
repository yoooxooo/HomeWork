package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

    private long countOperation;

    public void incrementCountOperation() {
        ++countOperation;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double squareRoot(double number) {
        incrementCountOperation();
        return calc.squareRoot(number);
    }

    public double module(double number) {
        incrementCountOperation();
        return calc.module(number);
    }

    public double degree(double number, int degree) {
        incrementCountOperation();
        return calc.degree(number, degree);
    }

    public double adding(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calc.adding(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calc.subtraction(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calc.multiplication(firstNumber, secondNumber);
    }

    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calc.division(firstNumber, secondNumber);
    }
}
