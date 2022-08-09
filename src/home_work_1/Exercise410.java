package home_work_1;

import java.util.Scanner;

public class Exercise410 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int number;
        while (true) {
            try {
                number = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
        }
        if (number % 2 != 0) {
            System.out.println("Число нечетное");
        } else {
            System.out.println("Число четное");
        }
    }
}
