package org.moldavets;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
//        int[] array = new int[] {13,5,10,4,3,33,21,18,9,11};
        int[] array = {0, 5, 3, 0, 2};
//        int[] array = {};
        radixSort(array);
    }

    public static void radixSort(int[] array) {
        int[] bucketCount = new int[10]; //todo

        int max = 0;
        for(int i = 0; i < array.length; i++) {
            max = max < array[i] ? array[i] : max;
        }

        for (int q = 1; q <= max; q*=10) {
            int[][] tempArray = new int[10][array.length];
            for(int i = 0; i < array.length; i++) {
                int tempResult = (array[i]/q)%10;
                for(int j = 0; j < array.length; j++) {
                    if(tempArray[tempResult][j] == 0) {
                        tempArray[tempResult][j] = array[i];

                        break;
                    }
                }
            }

            int n = 0;
            for (int i = 0; i < 10; i++) {
                for(int j = 0; j < array.length; j++) {
                    if (tempArray[i][j] != 0) {
                        array[n++] = tempArray[i][j];
                    }
                }
            }
        }
        Arrays.stream(array).forEach(System.out::println);
//        Arrays.stream(tempArray).forEach(a -> Arrays.stream(a).forEach(System.out::println));
    }

}
