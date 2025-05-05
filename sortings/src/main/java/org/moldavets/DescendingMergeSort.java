package org.moldavets;

import java.util.Arrays;

public class DescendingMergeSort {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Arrays.stream(mergeSort(array)).forEach(System.out::println);
    }

    private static int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length+secondArray.length];
        int i = 0, j = 0, k = 0;

        while(i < firstArray.length && j < secondArray.length){
            resultArray[k++] = firstArray[i] > secondArray[j] ? firstArray[i++] : secondArray[j++];
        }

        while (i < firstArray.length) {
            resultArray[k++] = firstArray[i++];
        }

        while (j < secondArray.length) {
            resultArray[k++] = secondArray[j++];
        }
        return resultArray;
    }

    private static int[] mergeSort(int[] array) {
        if(array.length == 1) {
            return array;
        }
        int mid = array.length/2;

        int[] firstTempArray = new int[mid];
        int[] secondTempArray = new int[array.length-mid];

        System.arraycopy(array, 0, firstTempArray, 0, mid);
        System.arraycopy(array, mid, secondTempArray, 0, array.length-mid);

        firstTempArray = mergeSort(firstTempArray);
        secondTempArray = mergeSort(secondTempArray);

        return mergeArrays(firstTempArray, secondTempArray);
    }
}
