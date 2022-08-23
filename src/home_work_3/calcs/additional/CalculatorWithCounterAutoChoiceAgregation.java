package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private long countOperation;

    private CalculatorWithOperator methodZero;
    private CalculatorWithMathExtends methodOne;
    private CalculatorWithMathCopy methodTwo;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator variable) {
        methodZero = variable;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends variable) {
        methodOne = variable;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy variable) {
        methodTwo = variable;
    }

    public void incrementCountOperation() {
        ++countOperation;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double squareRoot(double number) {
        incrementCountOperation();
        if (methodZero != null) {
           return methodZero.squareRoot(number);
        } else if (methodOne != null) {
           return methodOne.squareRoot(number);
        } else {
           return methodTwo.squareRoot(number);
        }
    }

    public double module(double number) {
        incrementCountOperation();
        if (methodZero != null) {
            return methodZero.module(number);
        } else if (methodOne != null) {
            return methodOne.module(number);
        } else {
            return methodTwo.module(number);
        }
    }

    public double degree(double number, int degree) {
        incrementCountOperation();
        if (methodZero != null) {
            return methodZero.degree(number, degree);
        } else if (methodOne != null) {
            return methodOne.degree(number, degree);
        } else {
            return methodTwo.degree(number, degree);
        }
    }

    public double adding(double firstNumber, double secondNumber) {
        incrementCountOperation();
        if (methodZero != null) {
            return methodZero.adding(firstNumber, secondNumber);
        } else if (methodOne != null) {
            return methodOne.adding(firstNumber, secondNumber);
        } else {
            return methodTwo.adding(firstNumber, secondNumber);
        }
    }

    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        if (methodZero != null) {
            return methodZero.subtraction(firstNumber, secondNumber);
        } else if (methodOne != null) {
            return methodOne.subtraction(firstNumber, secondNumber);
        } else {
            return methodTwo.subtraction(firstNumber, secondNumber);
        }
    }

    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        if (methodZero != null) {
            return methodZero.multiplication(firstNumber, secondNumber);
        } else if (methodOne != null) {
            return methodOne.multiplication(firstNumber, secondNumber);
        } else {
            return methodTwo.multiplication(firstNumber, secondNumber);
        }
    }

    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        if (methodZero != null) {
            return methodZero.division(firstNumber, secondNumber);
        } else if (methodOne != null) {
            return methodOne.division(firstNumber, secondNumber);
        } else {
            return methodTwo.division(firstNumber, secondNumber);
        }
    }
}
