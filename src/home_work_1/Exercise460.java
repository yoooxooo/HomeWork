package home_work_1;

import java.util.Scanner;

public class Exercise460 {
    public static void main(String[] args) {
        Components ex = new Components();
        Scanner console = new Scanner(System.in);
        System.out.println("Введи год, который тебе интересен");
        int year;
        while (true) {
            try {
                year = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
        }
        if (ex.year365(year)) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год не високосный");
        }
    }
}
