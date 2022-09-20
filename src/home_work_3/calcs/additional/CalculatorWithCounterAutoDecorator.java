package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator variant;

    private long countOperation;

    private long memorySocket;

    public ICalculator getCalculator(){
        return variant;
    }

    public long getMemorySocket() {
        long out;
        out = memorySocket;
        memorySocket = 0;
        return out;
    }

    public void setMemoryCountOperationSocket() {
        memorySocket = countOperation;
    }

    public CalculatorWithCounterAutoDecorator (ICalculator a) {
        variant = a;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation() {
        ++countOperation;
    }

    public double squareRoot(double number) {
        incrementCountOperation();
        return variant.squareRoot(number);
    }

    public double module(double number) {
        incrementCountOperation();
        return variant.module(number);
    }

    public double degree(double number, int degree) {
        incrementCountOperation();
        return variant.degree(number, degree);
    }

    public double adding(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return variant.adding(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return variant.subtraction(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return variant.multiplication(firstNumber, secondNumber);
    }

    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return variant.division(firstNumber, secondNumber);
    }
}
