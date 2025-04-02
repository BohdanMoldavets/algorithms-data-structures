package org.moldavets;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1,1,1};

        for(int unsortedPartLength = array.length-1; unsortedPartLength > 0; unsortedPartLength--) {
            for(int i = 0; i < unsortedPartLength; i++) {
                if (array[i] > array[i + 1]) {
                    int tempNum = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tempNum;
                }
            }
        }

        for (int num : array) {
            System.out.print(num + ", ");
        }
    }
}
