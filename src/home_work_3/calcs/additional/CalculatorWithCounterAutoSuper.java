package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long countOperation;

    public void incrementCountOperation() {
        ++countOperation;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double squareRoot(double number) {
        incrementCountOperation();
        return super.squareRoot(number);
    }

    public double module(double number) {
        incrementCountOperation();
        return super.module(number);
    }

    public double degree(double number, int degree) {
        incrementCountOperation();
        return super.degree(number, degree);
    }

    public double adding(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return super.adding(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return super.subtraction(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return super.multiplication(firstNumber, secondNumber);
    }

    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return super.division(firstNumber, secondNumber);
    }

}
