package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite firstEx = new CalculatorWithCounterAutoComposite();
        double result = firstEx.adding(firstEx.adding(4.1, firstEx.multiplication(15, 7)), firstEx.degree(firstEx.division(28, 5), 2));
        System.out.println(result);
        System.out.println(firstEx.getCountOperation());
    }
}
