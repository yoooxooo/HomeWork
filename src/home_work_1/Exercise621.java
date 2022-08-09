package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Exercise621 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String guestName = console.nextLine().trim();
        if (!Objects.equals(guestName,"Вася") && !Objects.equals(guestName,"Анастасия")) {
            System.out.println("Добрый день, а вы кто?");
        } else {
            if (Objects.equals(guestName,"Вася")) {
            System.out.println("Привет");
        }
        System.out.println("Я тебя так долго ждал");
        }
    }
}
