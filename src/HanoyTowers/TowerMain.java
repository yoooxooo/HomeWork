package HanoyTowers;

import java.util.Scanner;

public class TowerMain {
    public static void main(String[] args) throws InterruptedException {

        int pikeAmount = 0, circlesAmount, timer = 0;

        boolean pikeLock = false, rulesLock = false;

        String rules = "";

        Scanner console = new Scanner(System.in);

        while (true) {
            try {
                if (!rulesLock) {
                    System.out.println("Выбери какой режим игры ты предпочитаешь? Автоматический/Ручной");
                    rules = console.nextLine().trim();
                    if ("Автоматический".equals(rules) || "Ручной".equals(rules)) {
                        if ("Автоматический".equals(rules)) {
                            System.out.println("Введи задержку между ходами компьютера, в секундах");
                            timer = Integer.parseInt(console.nextLine().trim());
                            if (timer < 0) {
                                throw new RuntimeException();
                            }
                        }
                        rulesLock = true;
                    } else {
                        throw new RuntimeException();
                    }
                }
                if (!pikeLock) {
                    System.out.println("Введи количество стержней, с которым будет создана игра (3 - 8)");
                    pikeAmount = Integer.parseInt(console.nextLine().trim());
                    if (pikeAmount > 8 || pikeAmount < 3) {
                        throw new RuntimeException();
                    } else {
                        pikeLock = true;
                    }
                }
                    System.out.println("Введи количество колец, с которым будет создана игра (3 - 20)");
                    circlesAmount = Integer.parseInt(console.nextLine().trim());
                    if (circlesAmount > 20 || circlesAmount < 3) {
                        throw new RuntimeException();
                    }
                break;
            } catch (Exception e) {
                System.out.println("Кажется при вводе ты допустил ошибку");
                System.out.println("Попробуй еще раз");
            }
        }

        TowerAuto game = new TowerAuto(pikeAmount, circlesAmount, timer);

        if ("Ручной".equals(rules)) {
            System.out.println("Ты можешь передвигать кольца, набирая на клавиатуре два числа по порядку.");
            System.out.println("Первая цифра отвечает за то, с какого стержня будет взято кольцо.");
            System.out.println("Вторая цифра отвечает за то, на какой стержень будет помещено взятое кольцо.");
            System.out.println("Например '1 и 3' возьмет верхнее кольцо с первого стержня и, если это возможно, будет переместит его на третий стержень");
            System.out.println("Если ты хочешь выйти из игры, то в любой момент ты можешь написать слово 'Выход'");
        }

        do {
            if ("Ручной".equals(rules)) {
                if (manualNext(pikeAmount, game)) {
                    break;
                }
            } else {
                game.autoNext(circlesAmount);
                Thread.sleep(timer * 1000);
            }
    } while (game.checkNotWin());
        if (!game.checkNotWin()) {
            System.out.println("Поздравляю с победой!!!");
            System.out.println("На решение этой задачки у тебя ушло " + game.getOperationCounter() + " ходов");
        } else {
            System.out.println("До связи");
        }
    }

    public static boolean manualNext(int pikeAmount, TowerAuto game) {
        Scanner console = new Scanner(System.in);
        int input1, input2;
        String input;
        try {
            System.out.println("Выбери свой ход");
            input = console.nextLine().trim();
            if (game.checkExit(input)) {
                return true;
            }
            input1 = Integer.parseInt(input);

            input = console.nextLine().trim();
            if (game.checkExit(input)) {
                return true;
            }
            input2 =  Integer.parseInt(input);

            if (input1 < 1 || input1 > pikeAmount && input2 < 1 || input2 > pikeAmount) {
                throw new RuntimeException();
            }
            if (game.checkMoving(input1 - 1, input2 - 1)) {
                game.move(input1 - 1, input2 - 1);
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            System.out.println("Правила игры не позволяют сделать такую перестановку, или ты неправильно ввёл числа");
        }
        return false;
    }
}
