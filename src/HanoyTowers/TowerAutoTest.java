package HanoyTowers;

public class TowerAutoTest extends Tower{
    public TowerAutoTest(int pikeAmount, int circlesAmount,int timer) throws InterruptedException {
        super(pikeAmount, circlesAmount, timer);
    }

    private int counter = 1;

    public void autoNext(double circlesAmount, int pikesAmount, int timer ) throws InterruptedException {
        if ((circlesAmount / (pikesAmount - 2)) % 2 == 0) {
            if (counter == 1) {
                autoSwap(0, 1, 2, pikesAmount, timer);
            } else if (counter == 2) {
                autoSwap(0, 2, 3, pikesAmount, timer);
            } else {
                autoSwap(1, 2, 1, pikesAmount, timer);
            }
        } else {
            if (counter == 2) {
                autoSwap(0, 1, 3, pikesAmount, timer);
            } else if (counter == 1) {
                autoSwap(0, 2, 2, pikesAmount, timer);
            } else {
                autoSwap(1, 2, 1, pikesAmount, timer);
            }
        }

    }

    public void autoSwap(int position1, int position2, int counter, int pikesAmount, int timer) throws InterruptedException {

        if (checkPosition(position1) != -1 && getCircle(position1,checkPosition(position1)) > getCircle(position2, lowPosition(position2)) && getCircle(position2, 0) != 0) {
            int buffer1 = position1;
            position1 = position2;
            position2 = buffer1;
        }

        int buffer = position1;

        if (checkPosition(position1) == -1) {
            buffer = position2;
        }

        for (int i = pikesAmount - 1; i != 2; --i) {
            if (checkPosition(position1) == 0) {
                break;
            }
            move(buffer, i);
            Thread.sleep(timer);
            }

        if (checkMoving(position1, position2)) {
            move(position1, position2);
            Thread.sleep(timer);
            for (int i = 3; i < pikesAmount; ++i) {
                if (checkMoving(i, position2)) {
                    move(i, position2);
                    Thread.sleep(timer);
                }
            }
        } else {
            move(position2, position1);
            Thread.sleep(timer);
            for (int i = 3; i < pikesAmount; ++i) {
                if (checkMoving(i, position1)) {
                    move(i, position1);
                    Thread.sleep(timer);
                }
            }
        }
        this.counter = counter;
    }
}
