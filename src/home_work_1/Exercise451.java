package home_work_1;

import java.util.Scanner;

public class Exercise451 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введи номер знака, который ты хочешь узнать (пока мы поддерживаем только русский и английский)");
        int symbolNumber;
        char symbol;
        while (true) {
            try {
                symbolNumber = Integer.parseInt(console.nextLine().trim());
                if (symbolNumber > 127) {
                    throw new RuntimeException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе ты допустил ошибку, такое мы не сможем посчитать");
                System.out.println("Попробуй еще раз");
            }
        }
        symbol = (char)symbolNumber;
        if (symbol < 65 || symbol > 90 && symbol < 97 || symbol > 122 && symbol < 128) {
            System.out.println("Ты написал \"" + symbol + "\" и это символ");
        } else {
            System.out.println("Ты написал \"" + symbol + "\" и это буква");
        }
    }
}
