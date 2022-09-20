package home_work_1;

import java.util.Scanner;

public class Exercise451 {
    public static void main(String[] args) {
        Components ex = new Components();
        Scanner console = new Scanner(System.in);
        System.out.println("Введи номер знака, который ты хочешь узнать (пока мы поддерживаем только русский и английский)");
        int symbolNumber;
        while (true) {
            try {
                symbolNumber = Integer.parseInt(console.nextLine().trim());
                if (symbolNumber > 127 || symbolNumber < 1) {
                    throw new RuntimeException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе ты допустил ошибку, такое мы не сможем посчитать");
                System.out.println("Попробуй еще раз");
            }
        }
        if (ex.symbolOrNot(symbolNumber)) {
            System.out.println("Ты написал \"" + (char)symbolNumber + "\" и это символ");
        } else {
            System.out.println("Ты написал \"" + (char)symbolNumber + "\" и это буква");
        }
    }
}
