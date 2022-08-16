package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class Exercise2_4 {
    public static void main(String[] args){
        evenSumm();
        maximalEvenIndex();
        lessThanAverage();
        twoSmallestArrayElements();
        compressArray(5, 10);
        sumOfArrayDigits();

    }
    public static void evenSumm() {
        int[] arrRand = arrayRandom(50, 100);
        int sum = 0;
        for (int i = 0; i < arrRand.length; i++) {
            if (arrRand[i] >= 0 && arrRand[i] % 2 == 0) {
                sum = sum + arrRand[i];
            }
        }
        System.out.println("Сумма чётных положительных элементов массива: " + sum);
    }
    public static void maximalEvenIndex() {
        int[] arrRand = arrayRandom(50, 100);
        int maxNumber = 0;
        for (int i = 0; i < arrRand.length; i++){
            if(i % 2 == 0 && maxNumber < arrRand[i]){
                maxNumber = arrRand[i];
            }
        }
        System.out.println("Максимальный элемент массива с чётным индексом равен: " + maxNumber);
    }
    public static void lessThanAverage(){
        int[] arrRand = arrayRandom(50, 100);
        int sum = 0;
        for(int element : arrRand){
            sum += element;
        }
        double average = sum / arrRand.length;
        System.out.print("Элементы массива, меньше среднеего " + average + ": ");
        for(int i = 0; i < arrRand.length; i++){
            if(arrRand[i] < average){
                System.out.print(arrRand[i] + " ");
            }
        }
        System.out.print("\n");
    }
    public static void twoSmallestArrayElements(){
        int[] arrRand = arrayRandom(50, 100);
        int min1 = 100;
        int min2 = 100;
        int indexMin1 = 0;
        for(int i = 0; i < arrRand.length; i++) {
            System.out.print(arrRand[i] + " ");
            if (arrRand[i] < min1) {
                min1 = arrRand[i];
                indexMin1 = i;
            }
        }
        for(int j = 0; j < arrRand.length; j++){
            if(arrRand[j] < min2 && j != indexMin1){
                min2 = arrRand[j];
            }
        }
        System.out.print("\n");
        System.out.println("Двумя наименьшими элементами массива являются: " + min1 + " и " + min2);
    }
    public static void compressArray(int minDel, int maxDel){
        int[] arrRand = arrayRandom(50, 100);
        for(int element : arrRand){
            System.out.print(element + " ");
        }
        System.out.print("\n");
        int i = 0;
        while( i < arrRand.length){
            if(minDel <= arrRand[i] && arrRand[i] <= maxDel){
                int j = i;
                while (j < arrRand.length - 1){
                    arrRand[j] = arrRand[j + 1];
                    j++;
                }
                arrRand[arrRand.length - 1] = 0;
            } else {
                i++;
            }
        }
        System.out.println("После удаления элементов, принадлежащих интервалу: [" + minDel + "; " + maxDel + "]");
        for(int element : arrRand){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void sumOfArrayDigits(){
        int[] arrRand = arrayRandom(50, 100);
        for(int element : arrRand){
            System.out.print(element + " ");
        }
        System.out.println();
        int sum = 0;
        int number;
        for(int i = 0; i < arrRand.length; i++){
            number = arrRand[i];
            while(number !=0){
                sum += number % 10;
                number = number / 10;
            }
        }
        System.out.println("Сумма всех цифр массива равна: " + sum);
    }
}