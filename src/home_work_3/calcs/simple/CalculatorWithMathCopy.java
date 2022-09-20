package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

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
        if (secondNumber == 0 || firstNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    public double squareRoot(double number) {
        if (number < 0) {
            return 0;
        }
        return Math.sqrt(number);
    }

    public double module(double number) {
        return Math.abs(number);
    }

    public double degree(double number, int degree) {
        return Math.pow(number, degree);
    }
}
