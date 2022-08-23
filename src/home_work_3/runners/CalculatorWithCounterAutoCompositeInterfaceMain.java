package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.Scanner;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
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
        ICalculator method;
        if (variant == 1) {
            method = new CalculatorWithOperator();
        } else if (variant == 2) {
            method = new CalculatorWithMathExtends();
        } else {
            method = new CalculatorWithMathCopy();
        }

        CalculatorWithCounterAutoAgregationInterface solver = new CalculatorWithCounterAutoAgregationInterface(method);

        double result = solver.adding(solver.adding(4.1, solver.multiplication(15, 7)), solver.degree(solver.division(28, 5), 2));
        System.out.println("Результат, полученный методом" + " " + variant + " = " + result);
        System.out.println("Количество действий, потраченное на это равно " + solver.getCountOperation());
    }
}
