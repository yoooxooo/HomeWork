package HanoyTowers;

import java.io.IOException;
import java.util.Arrays;

public class Tower {

    private final int[][] area;

    private String[] data = new String[0];

    private long operationCounter;
    private final int pikeMaxIndex, circlesMaxIndex;

    public Tower(int pikeAmount, int circlesAmount, int timer) throws InterruptedException {
        this.area = new int[pikeAmount][circlesAmount];
        this.pikeMaxIndex = pikeAmount - 1;
        this.circlesMaxIndex = circlesAmount - 1;
        int num = circlesAmount;
        for (int i = 0; i <= circlesMaxIndex; i++) {
            area[0][i] = num;
            --num;
        }
        Print();
        System.out.println("\n\n");
        Thread.sleep(timer);
    }

    public void Print() {
        for (int j = circlesMaxIndex; j != -1; --j) {
            for (int i = 0; i <= pikeMaxIndex; ++i) {
                if (area[i][j] != 0) {
                    System.out.print(spaceMaker(area[i][j]) + circleMaker(area[i][j]) + spaceMaker(area[i][j]));
                } else {
                    System.out.print(spaceMaker(1) + "**" + spaceMaker(1));
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public String circleMaker(int areaValue) {
        String out = "";
        for (int k = 0; k < areaValue; ++k) {
            out += "--";
        }
        return out;
    }

    public String spaceMaker(int areaValue) {
        String out = "";
        for (int k = circlesMaxIndex - areaValue; k != -1; --k) {
            out += " ";
        }
        return out;
    }

    public int checkPosition(int pikeNumber) {
        int i;
        for (i = circlesMaxIndex; i != -1; --i) {
            if (area[pikeNumber][i] != 0) {
                return i;
            }
        }
        return i;
    }

    public boolean checkPossibility(int firstCircle, int secondCircle) {
        return (secondCircle - firstCircle > 0);
    }

    public boolean checkCirclesAvailable(int pikeNumber) {
        return (checkPosition(pikeNumber) != -1);
    }

    public boolean checkMoving(int firstPike, int secondPike) {
        if (!checkCirclesAvailable(firstPike)) {
            return false;
        }
        if (checkCirclesAvailable(secondPike)) {
            return checkPossibility(area[firstPike][checkPosition(firstPike)], area[secondPike][checkPosition(secondPike)]);
        }
        return true;
    }

    public void move (int firstPike, int secondPike) {
        if (checkMoving(firstPike, secondPike)) {
            int buffer = area[firstPike][checkPosition(firstPike)];
            area[firstPike][checkPosition(firstPike)] = area[secondPike][checkPosition(secondPike) + 1];
            area[secondPike][checkPosition(secondPike) + 1] = buffer;
            ++operationCounter;
            Print();
            System.out.println("\n\n");
        }
    }

    public long getOperationCounter() {
        return operationCounter;
    }

    public boolean checkNotWin() {
        for (int i = 1; i <= pikeMaxIndex; ++i) {
            if (area[i][circlesMaxIndex] == 1) {
                return false;
            }
        }
        return true;
    }

    public int getCircle(int pike,int position) {
        return area[pike][position];
    }

    public int lowPosition(int position) {
        return Math.max(checkPosition(position) - (pikeMaxIndex - 2), 0);
    }

    public void save(String name) throws IOException {
        FileSaver fs = new FileSaver();
        if (fs.saveFile(data, name)) {
            System.out.println("Игра сохранена");
        }
    }

    public void saveData(int input1,int input2) {
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length-1] = input1 + " " + input2;
    }

    public boolean checkExit(String word) {
        return (word.equals("Выход"));
    }
}
