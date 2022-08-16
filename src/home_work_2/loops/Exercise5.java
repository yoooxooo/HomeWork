package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int number = 0, fibonachiNumber = 0, min = 0, max = 0, step = 0, numberToTransform = 0;
        boolean lockerA = false, lockerB = false, lockerC = false, lockerD = false, lockerE = false, lockerF = false;
        while (true) {
            try {
                if (!lockerA) {
                    System.out.println("Введите натуральне число: ");
                    number = Integer.parseInt(console.nextLine().trim());
                    if (number > 0) {
                        lockerA=true;
                    }
                }
                if (!lockerB) {
                System.out.println("Введите колличество чисел последовательности Фибоначи");
                fibonachiNumber = Integer.parseInt(console.nextLine().trim());
                    if (fibonachiNumber > 0) {
                        lockerB=true;
                    }
                }
                if (!lockerC) {
                System.out.println("Введите минимальное число в ряду");
                min = Integer.parseInt(console.nextLine().trim());
                    if (min > 0) {
                        lockerC=true;
                    }
                }
                if (!lockerD) {
                System.out.println("Введите максимальное число в ряду");
                max = Integer.parseInt(console.nextLine().trim());
                    if (max > 0) {
                        lockerD=true;
                    }
                }
                if (!lockerE) {
                System.out.println("Введите шаг в ряду чисел");
                step = Integer.parseInt(console.nextLine().trim());
                    if (step > 0) {
                        lockerE=true;
                    }
                }
                if (!lockerF) {
                System.out.println("Введите число для его переворота");
                numberToTransform = Integer.parseInt(console.nextLine().trim());
                if (numberToTransform > 0) {
                        lockerF=true;
                    }
                }
                if (number < 0 || fibonachiNumber < 0 || min < 0 || max < 0 || step < 0 || numberToTransform < 0) {
                    throw new RuntimeException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Кажется где-то была допущена ошибка\nПопробуй еще раз");
            }
        }

        System.out.println("Наибольшая цифра натурального числа " + number + ": " + maxDigitFromNumber(number));

        System.out.println("Вероятность четных чисел: " + (chanceOfEven()) + "%");

        evenAndOddNumber(number);

        System.out.println("Последовательность Фибоначи длиной " + fibonachiNumber + ": " + fibonachi(fibonachiNumber));

        System.out.println("Ряд чисел имеет вид: " + sequenceOfNumbers(min, max, step));

        System.out.println("Число после переворота: " + numberTransormer(numberToTransform));

    }
    public static int maxDigitFromNumber(int a){
        int max = 0;
        int b;
        while (a != 0) {
            b = a % 10;
            if (b > max) {
                max = b;
            }
            a = a / 10;
        }
        return max;
    }
    public static double chanceOfEven(){
        Random randomNumber = new Random();
        double even = 0;
        for(int i = 0; i < 1000; i++){
            int a = randomNumber.nextInt();
            if(a % 2 == 0)
                even++;
        }
        return even/10;
    }
    public static void evenAndOddNumber(int a){
        int number = a;
        int evenNumber = 0;
        int oddNumber = 0;
        while(a != 0){
            if (a % 2 == 0){
                evenNumber++;
            } else {
                oddNumber++;
            }
            a = a / 10;
        }
        System.out.println("В числе " + number + " чётных цифр: " + evenNumber);
        System.out.println("В числе " + number + " нечётных цифр: " + oddNumber);
    }
    public static String fibonachi(int a){
        StringBuilder result = new StringBuilder("1");
        int x = 0;
        int y = 2;
        int z;
        for (int i = 0; i <= a - 2; i++){
            z = x + y;
            result.append(" ").append(z);
            x = y;
            y = z;
        }
        return result.toString();
    }
    public static String sequenceOfNumbers(int min, int max, int step){
        StringBuilder result = new StringBuilder();
        for(int i = min; i <= max; i = i + step){
            result.append(" ").append(i);
        }
        return result.toString();
    }
    public static String numberTransormer(int a){
        StringBuilder result = new StringBuilder();
        int b;
        while(a != 0){
            b = a % 10;
            result.append(b);
            a = a / 10;
        }
        return result.toString();
    }
}
