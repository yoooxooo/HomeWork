package home_work_1;

import java.util.Scanner;

public class Exercise630 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String guestName = console.nextLine().trim();
        switch (guestName) {
            case "Вася":
                System.out.println("Привет");
            case  "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
