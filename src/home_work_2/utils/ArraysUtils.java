package home_work_2.utils;

import java.util.Scanner;
import java.util.Random;

public class ArraysUtils {
    public static int[] arrayFromConsole(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = Integer.parseInt(console.nextLine().trim());
        int[] pack = new int[length];

        for(int i = 0; i < pack.length; i++){
            System.out.println("Введите значение элемента массива: ");
            pack[i] = Integer.parseInt(console.nextLine().trim());
        }
        return pack;
    }

    public int[] arrayFromConsole(int length){
        int[] pack = new int[length];
        for(int i = 1; i <= pack.length; i++){
            pack[i - 1] = i;
        }
        return pack;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] pack = new int[size];
        Random rand = new Random ();
        for(int i = 0; i < pack.length; i++){
            pack[i] = rand.nextInt(maxValueExclusion);
        }
        return pack;
    }
}
