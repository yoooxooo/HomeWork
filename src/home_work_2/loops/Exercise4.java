package home_work_2.loops;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number;
        while (true) {
            System.out.println("Введи число, которое ты хочешь возводить в степень до переполнения");
            number = console.nextLine().trim().replaceAll(",", ".");
            if (Exercise2.notNumberOrNumber(number)) {
                System.out.println("Вы ввели не число");
            } else if (Exercise3.notIntOrInt(number)) {
                System.out.println("Число должно быть целым");
            } else {
                break;
            }
        }
        System.out.println("Вы ввели число " + number + "\nЗначение до переполнения: " + beforeStack(Long.parseLong(number)) + "\nЗначение после переполнения: " + afterStack(Long.parseLong(number)));
    }
    public static long beforeStack(long a) {
        long ansver = 1;
        if (a == 1) {
            return 1;
        } else if (a == 0) {
            return 0;
        }
        while (true) {
            ansver = a * ansver;
            if (a < 0 && (Long.MIN_VALUE / a < ansver ||  ansver < Long.MAX_VALUE / a)) {
                return ansver;
            } else if (Long.MIN_VALUE / a > ansver ||  ansver > Long.MAX_VALUE / a) {
                return ansver;
            }
        }
    }
    public static long afterStack(long a) {
        long ansver = 1;
        if (a == 1) {
            return 1;
        } else if (a == 0) {
            return 0;
        }
        while (true) {
            ansver = a * ansver;
            if (a < 0 && (Long.MIN_VALUE / a < ansver ||  ansver < Long.MAX_VALUE / a)) {
                return ansver * a;
            } else if (Long.MIN_VALUE / a > ansver ||  ansver > Long.MAX_VALUE / a) {
                return ansver * a;
            }
        }
    }
}
