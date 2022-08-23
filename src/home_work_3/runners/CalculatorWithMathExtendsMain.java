package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends firstEx = new CalculatorWithMathExtends();
        double result = firstEx.adding(firstEx.adding(4.1, firstEx.multiplication(15, 7)), firstEx.degree(firstEx.division(28, 5), 2));
        System.out.println(result);
    }
}

