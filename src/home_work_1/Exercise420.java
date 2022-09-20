package home_work_1;

import java.util.Scanner;

public class Exercise420 {
    public static void main(String[] args) {
        Components ex = new Components();
        Scanner console = new Scanner(System.in);
        int numberA = 0;
        int numberB = 0;
        int numberC = 0;
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
            System.out.println(ex.median(numberA, numberB, numberC));
        }
    }
}
