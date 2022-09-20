package home_work_1;

import java.util.Scanner;

public class Exercise452 {
    public static void main(String[] args) {
        Components ex = new Components();
        Scanner console = new Scanner(System.in);
        System.out.println("Введи одну букву или символ (пока мы поддерживаем только английский)");
        String inputLine;
        int firstSymbol;
        char secondSymbol;
        char checkSymbol = ' ';
        char checkSymbolNaMax = 127;
        while (true) {
            try {
                inputLine = console.nextLine();
                inputLine = inputLine + " ";
                secondSymbol = inputLine.charAt(1);
                if (secondSymbol != checkSymbol || inputLine.charAt(0) > checkSymbolNaMax) {
                    throw new RuntimeException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Я просил только один символ или букву, и только на английском");
                System.out.println("Попробуй еще раз");
            }
        }
        firstSymbol = inputLine.charAt(0);
        if (ex.symbolOrNot(firstSymbol)) {
            System.out.println("Ты написал символ и его номер \"" + firstSymbol + "\"");
        } else {
            System.out.println("Ты написал букву и ее номер \"" + firstSymbol + "\"");
        }
    }
}
