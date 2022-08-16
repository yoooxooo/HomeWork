package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class Exercise2_2 {
    public static void main(String[] args) {
        allArray();
        secondElements();
        reverseArray();
    }
    public static void allArray() {
        int[] pack = arrayFromConsole();
        int i = 0;
        System.out.print("Перебор массива\n");
        System.out.print("С помощью do  while: ");
        do {
            System.out.print(pack[i] + " ");
            i++;
        }
        while (i < pack.length);
        System.out.print("\n");

        System.out.print("С помощью while: ");
        i = 0;
        while (i < pack.length) {
            System.out.print(pack[i] + " ");
            i++;
        }
        System.out.print("\n");

        System.out.print("С помощью for: ");
        for (i = 0; i < pack.length; i++) {
            System.out.print(pack[i] + " ");
        }
        System.out.print("\n");

        System.out.print("С помощью foreach: ");
        for (int element : pack) {
            System.out.print(element + " ");
        }
        System.out.print("\n");
    }

    public static void secondElements() {
        int[] pack = arrayFromConsole();
        int i = 1;
        System.out.print("Каждый второй элемент массива\n");
        System.out.print("С помощью do  while: ");
        do {
            System.out.print(pack[i] + " ");
            i += 2;
        }
        while (i < pack.length);
        System.out.print("\n");

        System.out.print("С помощью while: ");
        i = 1;
        while (i < pack.length) {
            System.out.print(pack[i] + " ");
            i += 2;
        }
        System.out.print("\n");

        System.out.print("С помощью for: ");
        for (i = 1; i < pack.length; i += 2) {
            System.out.print(pack[i] + " ");
        }
        System.out.print("\n");

        System.out.print("С помощью foreach: ");
        for (int element : pack) {
                System.out.print(element + " ");
            }
        System.out.print("\n");
    }

    public static void reverseArray() {
        int[] arr = arrayFromConsole();
        int i = arr.length - 1;
        System.out.print("Массив в обратном порядке\n");
        System.out.print("С помощью do...while: ");
        do {
            System.out.print(arr[i] + " ");
            i--;
        }
        while (i >= 0);
        System.out.print("\n");

        System.out.print("С помощью while: ");
        i = arr.length - 1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.print("\n");

        System.out.print("С помощью for: ");
        for (i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        System.out.print("С помощью foreach: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.print("\n");
    }
}
