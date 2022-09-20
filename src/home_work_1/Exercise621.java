package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Exercise621 {
    public static void main(String[] args) {
        Components ex = new Components();
        Scanner console = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String guestName = console.nextLine().trim();
        System.out.println(ex.reaction2(guestName));
    }
}
