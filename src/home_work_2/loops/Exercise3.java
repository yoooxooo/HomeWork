package home_work_2.loops;

import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number = "";
        String degree = "";
        while (true) {
            if (Exercise2.notNumberOrNumber(number)) {
                System.out.println("Введите число, которое будем возводить в степнь");
                number = console.nextLine().trim().replaceAll(",", ".");
            }
            if (Exercise2.notNumberOrNumber(number)) {
                System.out.println("Вы ввели не число");
                continue;
            }
            if (notIntOrInt(degree) || negativeOrNot(degree)) {
                System.out.println("Введите степень, в которую будем возводить число");
                degree = console.nextLine().trim().replaceAll(",", ".");
            }
            if (Exercise2.notNumberOrNumber(degree)) {
                System.out.println("Вы ввели не число");
            } else if (notIntOrInt(degree)) {
                System.out.println("Степень должна быть целой");
            } else if (negativeOrNot(degree)) {
                System.out.println("В нашем случае степень должна быть положительной");
            } else {
                break;
            }
        }
        System.out.println(number + " ^ " + degree + " = " + degreeMaker(number,degree));
    }
    public static boolean negativeOrNot(String a) {
        try {
            double ansver = Double.parseDouble(a);
            return !(ansver >= 0);
        } catch (Exception e) {
            return true;
        }
    }
    public static boolean notIntOrInt(String a) {
        try {
            Integer.parseInt(a);
            return false;
        } catch (Exception e) {
            return true;
        }
    }
    public static double degreeMaker(String a, String b) {
        double ansver = 1;
        for (int i = 0; i < Integer.parseInt(b); i++) {
            ansver = Double.parseDouble(a) * ansver;
        }
        if (Objects.equals(Integer.parseInt(b),0)) {
            return 1;
        } else {
            return ansver;
        }
    }
}
