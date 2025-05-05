package org.moldavets;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};
        recursiveInsertionSort(array, 1);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void recursiveInsertionSort(int[] array, int firstUnsortedIndex) {
        if(array.length <= firstUnsortedIndex) {
            return;
        }

        int temp = array[firstUnsortedIndex];

        int i;
        for(i = firstUnsortedIndex; i > 0 && array[i - 1] > temp; i--) {
            array[i] = array[i-1];
        }
        array[i] = temp;
        recursiveInsertionSort(array, ++firstUnsortedIndex);
    }
}
