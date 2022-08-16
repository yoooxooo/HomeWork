package home_work_2.loops;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int factorialNumber;
        while (true) {
            try {
                System.out.println("Введи число, факториал которого ты хочешь получить");
                factorialNumber = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе чисел ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
        }
        if (factorialPossibilityChecker(factorialNumber)) {
            for (int i = 1;i < factorialNumber;i++) {
                System.out.print(i + " * ");
            }
            System.out.print(factorialNumber + " = " + factorialMaker(factorialNumber));
        } else {
            System.out.println("Получаемое число слишком велико для наших текущих возможностей\nВ следующий раз выбирай число поменьше");
        }
    }
    public static boolean factorialPossibilityChecker(int a) {
        long ansver = 1;
        for (int i = 1;i <= a;i++) {
            if (ansver > ansver * i) {
                return false;
            }
            ansver = ansver * i;
        }
        return true;
    }

    public static long factorialMaker(int a) {
        long ansver = 1;
        for (int i = 1;i <= a;i++) {
            ansver = ansver * i;
        }
        return ansver;
    }
}