package home_work_1;

import java.util.Scanner;

public class Exercise420 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberA;
        int numberB;
        int numberC;
        while (true) {
            try {
                System.out.println("Введи первое число");
                numberA = Integer.parseInt(console.nextLine().trim());
                System.out.println("Введи второе число");
                numberB = Integer.parseInt(console.nextLine().trim());
                System.out.println("Введи третье число");
                numberC = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе чисел ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
        }
        if (numberA == numberB && numberB == numberC) {
            System.out.println("Эти числа равны и среди них нет среднего");
        } else if (numberA == numberB || numberB == numberC || numberA == numberC) {
            System.out.println("Ты ввел два одинаковых числа, так что среди них нельзя выделить среднее");
        } else if (numberA > numberB && numberA < numberC || numberA < numberB && numberA > numberC) {
            System.out.println("Средним является первое число");
        } else if (numberB > numberC && numberB < numberA || numberB < numberC && numberB > numberA) {
            System.out.println("Средним является второе число");
        } else {
            System.out.println("Средним является третье число");
        }
    }
}
