package home_work_1;

import java.util.Scanner;

public class Exercise500 {
    public static void main(String[] args) {
        Components ex = new Components();
        String workingDay = " ";
        String vacation = " ";
        Scanner console = new Scanner(System.in);
        while (true) {
            try {
                if (!workingDay.equals("Нет") && !workingDay.equals("Да")) {
                    System.out.println("Сегодня рабочий день? (Да/Нет)");
                    workingDay = console.nextLine().trim();
                }
                if (!workingDay.equals("Нет") && !workingDay.equals("Да")) {
                    throw new RuntimeException();
                }
                if (!vacation.equals("Нет") && !vacation.equals("Да")) {
                    System.out.println("Сегодня отпуск? (Да/Нет)");
                    vacation = console.nextLine().trim();
                }
                if (!vacation.equals("Нет") && !vacation.equals("Да")) {
                    throw new RuntimeException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
        }
        System.out.println(ex.sleepOrNot(workingDay, vacation));
    }
}
