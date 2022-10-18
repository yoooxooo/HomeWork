package ppt;

public class Thread1 {

    public static void main(String[] args) {
        Thread thread = new NewThread();
        System.out.println("Создаем новый поток");
        thread.start();
        System.out.println("Поток создан");
    }

    public static class NewThread extends Thread{
        public void run() {
            System.out.println("Я новый поток");
        }
    }
}
