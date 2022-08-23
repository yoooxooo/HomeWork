package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.Scanner;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        System.out.println("Напишите, каким из методов вы хотите посчитать пример? (1, 2 или 3)");
        while (true) {
            try {
                number = Integer.parseInt(console.nextLine().trim());
                if (number > 0 && number < 4) {
                    break;
                }
                throw new RuntimeException();
            } catch (Exception e) {
                System.out.println("Кажется при вводе числа ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
        }
        ICalculator variant;
        if (number == 1) {
            variant = new CalculatorWithOperator();
        } else if (number == 2) {
            variant = new CalculatorWithMathExtends();
        } else {
            variant = new CalculatorWithMathCopy();
        }

        ICalculator method = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(variant));

        double result = method.degree(method.division(28, 5), 2);
        CalculatorWithMemoryDecorator.setMemorySocket();
        CalculatorWithCounterAutoDecorator.setMemoryCountOperationSocket();
        result = method.adding(method.adding(4.1, method.multiplication(15, 7)), result);
        System.out.println("Результат, полученный методом " + number + " = " + result);
        System.out.println("Значение в памяти после " + CalculatorWithCounterAutoDecorator.getMemorySocket() + " операции = " + CalculatorWithMemoryDecorator.getMemorySocket());
        System.out.println("Однако после вызова значений в памяти они стираются, поэтому на теперь можно довольствоваться значениями " + CalculatorWithCounterAutoDecorator.getMemorySocket() + " и " + CalculatorWithMemoryDecorator.getMemorySocket());
        System.out.println("Количество действий, потраченное на все уравнение равно " + CalculatorWithCounterAutoDecorator.getCountOperation());
        System.out.println("Использовались следующие 'декораторы' и калькулятор:");
        System.out.println(method);
        System.out.println(CalculatorWithCounterAutoDecorator.getCalculator());
        System.out.println(CalculatorWithMemoryDecorator.getCalculator());
    }
}
