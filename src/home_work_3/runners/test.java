package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class test {
    public static void main(String[] args) {
        ICalculator variant = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        CalculatorWithMemoryDecorator method = new CalculatorWithMemoryDecorator(variant);

        System.out.println(method.getCalculator());

    }
}
