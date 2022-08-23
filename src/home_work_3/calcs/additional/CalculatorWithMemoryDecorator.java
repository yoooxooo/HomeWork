package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    private static ICalculator variant;

    private static double memory;

    private static double memorySocket;

    public static ICalculator getCalculator(){
            return variant;
    }

    public CalculatorWithMemoryDecorator (ICalculator a) {
        variant = a;
    }

    public static void setMemorySocket() {
        memorySocket = memory;
    }
    public static double getMemorySocket() {
        double output;
        output = memorySocket;
        memorySocket = 0;
        return output;
    }

    public double squareRoot(double number) {
        return memory = variant.squareRoot(number);
    }

    public double module(double number) {
        return memory = variant.module(number);
    }

    public double degree(double number, int degree) {
        return memory = variant.degree(number, degree);
    }

    public double adding(double firstNumber, double secondNumber) {
        return memory = variant.adding(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        return memory = variant.subtraction(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        return memory = variant.multiplication(firstNumber, secondNumber);
    }

    public double division(double firstNumber, double secondNumber) {
        return memory = variant.division(firstNumber, secondNumber);
    }
}
