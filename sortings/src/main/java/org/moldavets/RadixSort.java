package org.moldavets;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = new int[] {13,5,10,4,3,33,21,18,9,11};
//        int[] array = {0, 5, 3, 0, 2};
//        int[] array = {};
//        int[] array = {100, 0, 0, 3, 20, 105, 9, 5};
        radixSort(array);
    }

    public static void radixSort(int[] array) {
        int max = 0;
        for(int i = 0; i < array.length; i++) {
            max = max < array[i] ? array[i] : max;
        }

        for (int q = 1; q <= max; q*=10) {
            int[] bucketCount = new int[10];
            int[][] tempArray = new int[10][array.length];
            for(int i = 0; i < array.length; i++) {
                int digit = (array[i]/q)%10;
                    tempArray[digit][bucketCount[digit]++] = array[i];
            }

            int n = 0;
            for (int i = 0; i < 10; i++) {
                for(int j = 0; j < bucketCount[i]; j++) {
                    array[n++] = tempArray[i][j];
                }
            }
        }
        Arrays.stream(array).forEach(System.out::println);
//        Arrays.stream(tempArray).forEach(a -> Arrays.stream(a).forEach(System.out::println));
    }

}
