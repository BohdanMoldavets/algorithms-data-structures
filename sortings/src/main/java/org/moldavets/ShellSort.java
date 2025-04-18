package org.moldavets;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};

        for (int gap = array.length/2; gap >= 1; gap /= 2) {
            for(int i = gap; i < array.length; i ++) {
                int temp = array[i];
                int j;
                for(j = i; j > 0 && array[j-gap] > temp; j -= gap) {
                    array[j] = array[j-gap];
                }
                array[j] = temp;
            }
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
