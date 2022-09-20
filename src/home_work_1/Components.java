package home_work_1;

import java.util.Objects;

public class Components {

    public String pobit(int firstNumber, int secondNumber, String manipulation) {
        StringBuilder str = new StringBuilder();
        int answer;
        if (manipulation.equals("и")) {
            answer = firstNumber & secondNumber;
            String answerInBit = Integer.toBinaryString(answer);
            String firstNumberInBit = Integer.toBinaryString(firstNumber);
            String secondNumberInBit = Integer.toBinaryString(secondNumber);
            str.append("Побитовое И для чисел ").append(firstNumber).append(" и ").append(secondNumber).append(": ").append(answer).append("\n");
            str.append("  ").append(String.format("%32s", firstNumberInBit).replaceAll(" ", "0")).append("| ").append(firstNumber).append("\n");
            str.append("& ").append(String.format("%32s", secondNumberInBit).replaceAll(" ", "0")).append("| ").append(secondNumber).append("\n");
            str.append("  ").append(String.format("%32s", answerInBit).replaceAll(" ", "0")).append("| ").append(answer).append("\n");
        } else {
            answer = firstNumber | secondNumber;
            String answerInBit = Integer.toBinaryString(answer);
            String firstNumberInBit = Integer.toBinaryString(firstNumber);
            String secondNumberInBit = Integer.toBinaryString(secondNumber);
            str.append("Побитовое ИЛИ для чисел ").append(firstNumber).append(" и ").append(secondNumber).append(": ").append(answer).append("\n");
            str.append("  ").append(String.format("%32s", firstNumberInBit).replaceAll(" ", "0")).append("| ").append(firstNumber).append("\n");
            str.append("| ").append(String.format("%32s", secondNumberInBit).replaceAll(" ", "0")).append("| ").append(secondNumber).append("\n");
            str.append("  ").append(String.format("%32s", answerInBit).replaceAll(" ", "0")).append("| ").append(answer).append("\n");
        }
        return str.toString();
    }

    public boolean oddOrNot(int a) {
        return a % 2 != 0;
    }

    public String median(int numberA, int numberB, int numberC) {
        StringBuilder str = new StringBuilder();
        if (numberA == numberB && numberB == numberC) {
            str.append("Эти числа равны и среди них нет среднего");
        } else if (numberA == numberB || numberB == numberC || numberA == numberC) {
            str.append("Ты ввел два одинаковых числа, так что среди них нельзя выделить среднее");
        } else if (numberA > numberB && numberA < numberC || numberA < numberB && numberA > numberC) {
            str.append("Средним является первое число");
        } else if (numberB > numberC && numberB < numberA || numberB < numberC && numberB > numberA) {
            str.append("Средним является второе число");
        } else {
            str.append("Средним является третье число");
        }
        return str.toString();
    }

    public String dividingCheck(int numberA, int numberB) {
        StringBuilder str = new StringBuilder();
        if (numberA == 0 || numberB == 0) {
            str.append("Здесь не высшая математика, чтобы играться с нулями");
        } else if (numberA % numberB == 0) {
            str.append("Они делятся без остатка");
        } else {
            str.append("Деление то пройдет, но остаточек останется");
        }
        return str.toString();
    }

    public String bitConverter(int amount, int typeOfConversion) {
        StringBuilder str = new StringBuilder();
        if (amount < 0) {
            str.append("Не вижу смысла переводить отрицательные данные");
        } else if (amount == 0) {
            str.append("0 он и в байтах и в килобайтах 0");
        } else if (typeOfConversion == 1) {
            str.append("По моим подсчетам вышло ").append(amount / 1024).append(" килобайт и ").append(amount % 1024).append(" байт");
        } else {
            str.append("По моим подсчетам вышло ").append(amount * 1024).append(" байт");
        }
        return str.toString();
    }

    public boolean symbolOrNot(int symbol) {
        return symbol < 65 || symbol > 90 && symbol < 97 || symbol > 122 && symbol < 128;
    }

    public boolean year365(int year) {
        return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }

    public String sleepOrNot(String workingDay, String vacation) {
        StringBuilder str = new StringBuilder();
        if (vacation.equals("Да") || workingDay.equals("Нет")) {
            str.append("Можешь спать дальше");
        } else {
            str.append("Пора идти на работу");
        }
        return str.toString();
    }

    public String reaction1(String guestName) {
        StringBuilder str = new StringBuilder();
        if (Objects.equals(guestName,"Вася")) {
            str.append("Привет\n");
        }
        if (Objects.equals(guestName,"Вася") || Objects.equals(guestName,"Анастасия")) {
            str.append("Я тебя так долго ждал");
        } else {
            str.append("Добрый день, а вы кто?");
        }
        return str.toString();
    }

    public String reaction2(String guestName) {
        StringBuilder str = new StringBuilder();
        if (!Objects.equals(guestName, "Вася") && !Objects.equals(guestName, "Анастасия")) {
            str.append("Добрый день, а вы кто?");
        } else {
            if (Objects.equals(guestName, "Вася")) {
                str.append("Привет\n");
            }
            str.append("Я тебя так долго ждал");
        }
        return str.toString();
    }

    public String reaction3(String guestName) {
        StringBuilder str = new StringBuilder();
        switch (guestName) {
            case "Вася":
                str.append("Привет\n");
            case  "Анастасия":
                str.append("Я тебя так долго ждал");
                break;
            default:
                str.append("Добрый день, а вы кто?");
        }
        return str.toString();
    }
}
