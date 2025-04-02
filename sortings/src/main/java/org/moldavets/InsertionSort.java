package org.moldavets;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};
//      int[] array = {20,35,35,7,55,1,-22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int temp = array[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > temp; i--) {
                array[i] = array[i-1];
            }
            array[i] = temp;
        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
