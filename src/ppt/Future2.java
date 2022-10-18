package ppt;

import java.util.concurrent.ExecutionException;

public class Future2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable task = () -> {
            for (int i = 1; i < 11 ; ++i) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Привет, прошло 10 секунд");
    }
}
