package ppt;

import java.util.concurrent.Callable;

public class Callable1 {
    public static void main(String[] args) throws Exception {
        Callable<String> task = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Привет";
            }
        };
        System.out.println(task.call());
    }
}
