package org.moldavets;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
//        int[] array = new int[]{2,5,9,8,2,8,7,10,4,3};
//        int[] array = {4, 2, 2, 8, 3, 3, 1};
//        int[] array = {5, 5, 5, 5, 5};
//        int[] array = {1, 2, 3, 4, 5};
        int[] array = {9, 7, 5, 3, 1};
//        int[] array = {0, 0, 1, 0, 2, 3};


        countingSort(array, 1, 9);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void countingSort(int[] array, int min, int max) {
        int[] countingArray = new int[(max-min) + 1];
        for(int i = 0; i < array.length; i++) {
            countingArray[array[i] - min]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++) {
            while (countingArray[i - min] > 0) {
                array[j++] = i;
                countingArray[i - min]--;
            }
        }
    }
}
