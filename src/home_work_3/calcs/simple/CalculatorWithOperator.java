package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public double adding(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public double degree(double firstNumber, int degree) {
        double result = 1;
        for (int i = 0; i < degree; i++) {
            result = firstNumber * result;
        }
        return result;
    }

    public double module(double number) {
        if (number < 0) {
            return -number;
        }
        return number;
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}