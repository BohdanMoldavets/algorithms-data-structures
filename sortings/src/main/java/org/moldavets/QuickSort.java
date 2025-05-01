package org.moldavets;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[] {8,2,4,7,1,3,9,6,5};
//        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
//        int[] array = {9999999, -9999999, 123456, -123456, 0, 42, -42};
//        int[] array = {7, 7, 7, 7, 7, 7, 7};
//        int[] array = {5, 3, 5, 3, 5, 3, 5, 3};
//        int[] array = {20,35,-15,7,55,1,-22};
        quickSort(array,0, array.length-1);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void quickSort(int[] array, int start, int end) {
        if(start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end - 1; j++) {
            if(array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}