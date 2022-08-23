package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic firstEx = new CalculatorWithCounterClassic();
        double result = firstEx.division(28, 5);
        firstEx.incrementCountOperation();
        result = firstEx.degree(result, 2);
        firstEx.incrementCountOperation();
        double resultSecond = firstEx.multiplication(15, 7);
        firstEx.incrementCountOperation();
        resultSecond = firstEx.adding(4.1, resultSecond);
        firstEx.incrementCountOperation();
        result = firstEx.adding(resultSecond, result);
        firstEx.incrementCountOperation();

        System.out.println(result);
        System.out.println(firstEx.getCountOperation());
    }
}
