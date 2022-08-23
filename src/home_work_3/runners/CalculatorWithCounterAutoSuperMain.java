package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper firstEx = new CalculatorWithCounterAutoSuper();
        double result = firstEx.adding(firstEx.adding(4.1, firstEx.multiplication(15, 7)), firstEx.degree(firstEx.division(28, 5), 2));
        System.out.println(result);
        System.out.println(firstEx.getCountOperation());
    }
}
