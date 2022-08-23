package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithCounterAutoSuper calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper i) {
        calc = i;
    }

    public long getCountOperation() {
        return  calc.getCountOperation();
    }

    public double squareRoot(double number) {
        return calc.squareRoot(number);
    }

    public double module(double number) {
        return calc.module(number);
    }

    public double degree(double number, int degree) {
        return calc.degree(number, degree);
    }

    public double adding(double firstNumber, double secondNumber) {
        return calc.adding(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        return calc.subtraction(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        return calc.multiplication(firstNumber, secondNumber);
    }

    public double division(double firstNumber, double secondNumber) {
        return calc.division(firstNumber, secondNumber);
    }
}
