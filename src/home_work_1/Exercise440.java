package home_work_1;

import java.util.Scanner;

public class Exercise440 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Если хочешь перевести байты в килобайты, то напиши цифру \"1\"");
        System.out.println("Если хочешь наоборот килобайты в байты, то напиши цифру \"2\"");
        int amount, typeOfConversion;
        while (true) {
            try {
                typeOfConversion = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
        }
        if (typeOfConversion == 1 || typeOfConversion == 2){
            System.out.println("Хорошо, вводи значение, которое ты хочешь перевести");
            while (true) {
                try {
                    amount = Integer.parseInt(console.nextLine().trim());
                    break;
                } catch (Exception e) {
                    System.out.println("Кажется при вводе числа ты допустил ошибку");
                    System.out.println("Попробуй еще раз");
                }
            }
            if (amount < 0) {
                System.out.println("Не вижу смысла переводить отрицательные данные");
            } else if (amount == 0) {
                System.out.println("0 он и в байтах и в килобайтах 0");
            } else if (typeOfConversion == 1) {
                System.out.println("По моим подсчетам вышло " + amount / 1024 + " килобайт и " + amount % 1024 + " байт");
            } else {
                System.out.println("По моим подсчетам вышло " + amount * 1024 + " байт");
            }
        } else {
            System.out.println("Таких вариантов как ты просишь у нас в списке нет");
        }
    }
}
