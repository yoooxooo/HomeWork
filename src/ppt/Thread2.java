package ppt;

public class Thread2 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Я новый поток");
            }
        };
        System.out.println("Создаем новый поток");
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Поток создан");
    }
}
