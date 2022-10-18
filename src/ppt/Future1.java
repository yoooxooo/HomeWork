package ppt;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Future1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> task = () -> {
            for (int i = 1; i < 11 ; ++i) {
                Thread.sleep(1000);
                System.out.println(i);
            }
            return "Привет, прошло 10 секунд";
        };
        FutureTask<String> future = new FutureTask<>(task);
        Thread thread = new Thread(future);
        thread.start();
        System.out.println(future.get());
    }
}
