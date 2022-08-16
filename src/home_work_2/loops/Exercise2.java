package home_work_2.loops;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number;
        while (true) {
            System.out.println("Введи число, которое ты хочешь разложить и перемножить");
            number = console.nextLine().trim().replaceAll(",", ".");
                   if (notNumberOrNumber(number)) {
                       System.out.println("Это не число");
                   } else if (doubleOrNot(number)) {
                       System.out.println("Число не целое");
                       } else {
                       break;
                   }
               }
        for (int i = 0; i < number.length() - 1; i++) {
            System.out.print(number.charAt(i) + " * ");
        }
        System.out.print(number.charAt(number.length() - 1) + " = " + numberLineToMultipliedResult(number));
    }

    public static long numberLineToMultipliedResult(String a) {
        long ansver = 1;
        for (int i = 0; i < a.length(); i++) {
            ansver = ansver * Character.digit(a.charAt(i), 10);
        }
        return ansver;
    }

    public static boolean notNumberOrNumber(String a) {
        try {
            Double.parseDouble(a);
            return false;
            } catch (Exception e) {
            return true;
        }
    }
    public static boolean doubleOrNot(String a) {
        for (int i = 0; i < a.length(); i++) {
            char symbol = a.charAt(i);
                if (symbol == '.') {
                    return true;
                }
            }
            return false;
    }
}
