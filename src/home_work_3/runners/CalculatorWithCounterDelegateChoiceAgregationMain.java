package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.Scanner;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int variant;
        System.out.println("Напишите, каким из методов вы хотите посчитать пример? (1, 2 или 3)");
        while (true) {
            try {
                variant = Integer.parseInt(console.nextLine().trim());
                if (variant > 0 && variant < 4) {
                    break;
                }
                throw new RuntimeException();
            } catch (Exception e) {
                System.out.println("Кажется при вводе числа ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
        }

        CalculatorWithCounterAutoChoiceAgregation method;
        if (variant == 1) {
            CalculatorWithOperator methodZero = new CalculatorWithOperator();
            method = new CalculatorWithCounterAutoChoiceAgregation(methodZero);
        } else if (variant == 2) {
            CalculatorWithMathExtends methodOne = new CalculatorWithMathExtends();
            method = new CalculatorWithCounterAutoChoiceAgregation(methodOne);
        } else {
            CalculatorWithMathCopy methodTwo = new CalculatorWithMathCopy();
            method = new CalculatorWithCounterAutoChoiceAgregation(methodTwo);
        }

        double result = method.adding(method.adding(4.1, method.multiplication(15, 7)), method.degree(method.division(28, 5), 2));
        System.out.println("Результат, полученный методом" + " " + variant + " = " + result);
        System.out.println("Количество действий, потраченное на это равно " + method.getCountOperation());
    }
}
