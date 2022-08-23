package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.Scanner;

public class CalculatorWithMemoryMain {
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

        CalculatorWithMemory method = new CalculatorWithMemory(variant);

        double result = method.degree(method.division(28, 5), 2);
        method.setMemorySocket();
        result = method.adding(method.adding(4.1, method.multiplication(15, 7)), result);
        System.out.println("Результат, полученный методом " + number + " = " + result);
        System.out.println("Значение в памяти после " + method.getMemoryCountOperationSocket() + " операции = " + method.getMemoryResultSocket());
        System.out.println("Однако после вызова значений в памяти они стираются, поэтому на теперь можно довольствоваться значениями " + method.getMemoryCountOperationSocket() + " и " + method.getMemoryResultSocket());
        System.out.println("Количество действий, потраченное на все уравнение равно " + method.getCountOperation());
    }
}
