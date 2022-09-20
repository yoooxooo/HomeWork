package home_work_2.arrays;

public class Exercise2_4 {

    public int evenSumm(int [] arrRand) {
        int sum = 0;
        for (int j : arrRand) {
            if (j >= 0 && j % 2 == 0) {
                sum = sum + j;
            }
        }
        return sum;
    }
    public int maximalEvenIndex(int [] arrRand) {
        int maxNumber = 0;
        for (int j : arrRand) {
            if (j % 2 == 0 && maxNumber < j) {
                maxNumber = j;
            }
        }
        return maxNumber;
    }
    public String lessThanAverage(int [] arrRand){
        double sum = 0;
        for(int element : arrRand){
            sum += element;
        }
        double average = sum / arrRand.length;
        StringBuilder str = new StringBuilder();
        for (int j : arrRand) {
            if (j < average) {
                str.append(j).append(" ");
            }
        }
        return str.toString();
    }
    public String twoSmallestArrayElements(int [] arrRand){
        int min1 = 100;
        int min2 = 100;
        int indexMin1 = 0;
        for(int i = 0; i < arrRand.length; i++) {
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
        return min1 + " " + min2;
    }
    public String compressArray(int[] arrRand, int minDel, int maxDel){
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
        StringBuilder str = new StringBuilder();
        for(int element : arrRand){
            str.append(element).append(" ");
        }
        return str.toString();
    }
    public int sumOfArrayDigits(int[] arrRand){
        int sum = 0;
        int number;
        for (int j : arrRand) {
            number = j;
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
        }
        return sum;
    }
}