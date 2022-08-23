package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private final ICalculator variant;

    private long countOperation;

    private double memoryResultSocket;

    private long memoryCountOperationSocket;

    private double memory;

    public CalculatorWithMemory(ICalculator a) {
        variant = a;
    }

    public void setMemorySocket() {
        this.memoryResultSocket = memory;
        this.memoryCountOperationSocket = countOperation;
    }

    public double getMemoryResultSocket() {
        double output;
        output = memoryResultSocket;
        memoryResultSocket = 0;
        return output;
    }

    public long getMemoryCountOperationSocket() {
        long output;
        output = memoryCountOperationSocket;
        memoryCountOperationSocket = 0;
        return output;
    }

    public long getCountOperation() {
        return  countOperation;
    }

    public void incrementCountOperation() {
        ++countOperation;
    }

    public double squareRoot(double number) {
        incrementCountOperation();
        return memory = variant.squareRoot(number);
    }

    public double module(double number) {
        incrementCountOperation();
        return memory = variant.module(number);
    }

    public double degree(double number, int degree) {
        incrementCountOperation();
        return memory = variant.degree(number, degree);
    }

    public double adding(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return memory = variant.adding(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return memory = variant.subtraction(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return memory = variant.multiplication(firstNumber, secondNumber);
    }

    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return memory = variant.division(firstNumber, secondNumber);
    }
}
