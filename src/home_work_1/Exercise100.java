package home_work_1;

import java.util.Scanner;

public class Exercise100 {
    public static void main(String[] args) {
        Components ex = new Components();
        Scanner console = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        boolean firstLocker = false;
        boolean secondLocker = false;
        String manipulation = " ";
        while (true) {
            try {
                if (!firstLocker) {
                    System.out.println("Введи первое число, с которым ты хочешь работать");
                    firstNumber = Integer.parseInt(console.nextLine().trim());
                    firstLocker = true;
                }
                if (!secondLocker) {
                    System.out.println("Введи второе число, с которым ты хочешь работать");
                    secondNumber = Integer.parseInt(console.nextLine().trim());
                    secondLocker = true;
                }
                if (!manipulation.equals("и") && !manipulation.equals("или")) {
                    System.out.println("Какой вид побитого преобразования ты хочешь провести (и/или)?");
                    manipulation = console.nextLine().trim();
                }
                if (!manipulation.equals("и") && !manipulation.equals("или")) {
                    throw new RuntimeException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
            /*
            Дальше идет код, который прямо в консоли выводит ответ для любых наборов вводимых чисел, ограниченных только размерами переменной Integer
            Поэтому я не считаю нужным отдельно выводить пример двух случайных чисел

            В случае же переменных типа float и double (42.5), .toBinaryString и побитные операторы работать не будут, однако скорее всего для большинства случаев это можно исправить переводя Double в Long или Float в Integer с помощью
            Double.doubleToRawLongBits(переменная) или Float.floatToRawIntBits(переменная), после чего переводить обратно при надобности с помощью Double.longBitsToDouble(переменная) и Float.intBitsToFloat(переменная)
             */
        }
        System.out.println(ex.pobit(firstNumber, secondNumber, manipulation));
    }
}
