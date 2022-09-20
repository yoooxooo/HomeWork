package home_work_1;

import java.util.Scanner;

public class Exercise430 {
    public static void main(String[] args) {
        Components ex = new Components();
        Scanner console = new Scanner(System.in);
        int numberA;
        int numberB;
        while (true) {
            try {
                System.out.println("Введи делимое");
                numberA = Integer.parseInt(console.nextLine().trim());
                System.out.println("Введи делитель");
                numberB = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе чисел ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
        }
        System.out.println(ex.dividingCheck(numberA, numberB));
    }
}
