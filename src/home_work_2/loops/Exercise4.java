package home_work_2.loops;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Exercise4 ex4 = new Exercise4();
        Exercise3 ex3 =new Exercise3();
        Exercise2 ex = new Exercise2();
        Scanner console = new Scanner(System.in);
        String number;
        while (true) {
            System.out.println("Введи число, которое ты хочешь возводить в степень до переполнения");
            number = console.nextLine().trim().replaceAll(",", ".");
            if (ex.notNumberOrNumber(number)) {
                System.out.println("Вы ввели не число");
            } else if (ex3.notIntOrInt(number)) {
                System.out.println("Число должно быть целым");
            } else {
                break;
            }
        }
        System.out.println("Вы ввели число " + number + "\nЗначение до переполнения: " + ex4.beforeStack(Long.parseLong(number)) + "\nЗначение после переполнения: " + ex4.afterStack(Long.parseLong(number)));
    }
    public long beforeStack(long a) {
        long ansver = 1;
        if (a == 1) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else if (a == -1) {
            return -1;
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
    public long afterStack(long a) {
        long ansver = 1;
        if (a == 1) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else if (a == -1) {
            return -1;
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
