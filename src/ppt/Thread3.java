package ppt;

import java.util.ArrayList;
import java.util.List;


public class Thread3 {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        long time = System.currentTimeMillis();

        for (int i = 0; i < 10000000; ++i) {
            list1.add(1);
            list1.add(2);
            list1.add(3);
        }
        System.out.println("Заполнение последовательно: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000000; ++i) {
                list1.add(1);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000000; ++i) {
                list2.add(2);
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10000000; ++i) {
                list3.add(3);
            }
        });

        thread1.start();
        thread3.start();
        thread2.start();
        while (thread3.isAlive() && thread2.isAlive() && thread1.isAlive()) {
            Thread.sleep(100);
        }
        System.out.println("Заполнение параллельно: " + (System.currentTimeMillis() - time));

    }
}
