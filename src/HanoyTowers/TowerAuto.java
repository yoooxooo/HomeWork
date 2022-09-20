package HanoyTowers;

public class TowerAuto extends Tower{
    public TowerAuto(int pikeAmount, int circlesAmount, int timer) throws InterruptedException {
        super(pikeAmount, circlesAmount, timer);
    }

    private int counter = 1;

    public void autoNext(int circlesAmount) {
        if (circlesAmount % 2 == 0) {
            if (counter == 1) {
                autoSwap(0, 1, 2);
            } else if (counter == 2) {
                autoSwap(0, 2, 3);
            } else {
                autoSwap(1, 2, 1);
            }
        } else {
            if (counter == 2) {
                autoSwap(0, 1, 3);
            } else if (counter == 1) {
                autoSwap(0, 2, 2);
            } else {
                autoSwap(1, 2, 1);
            }
        }

    }

    public void autoSwap(int position1, int position2, int counter) {
        if (checkMoving(position1, position2)) {
            move(position1, position2);
        } else {
            move(position2, position1);
        }
        this.counter = counter;
    }
}
