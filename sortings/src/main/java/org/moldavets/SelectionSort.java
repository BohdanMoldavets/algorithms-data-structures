package org.moldavets;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};

        for(int unsortedArrayLength = array.length-1; unsortedArrayLength > 0; unsortedArrayLength--) {
            int largestNumIndex = 0;
            for(int i = 1; i <= unsortedArrayLength; i++) {
                if(array[i] > array[largestNumIndex]) {
                    largestNumIndex = i;
                }
            }
            int temp = array[unsortedArrayLength];
            array[unsortedArrayLength] = array[largestNumIndex];
            array[largestNumIndex] = temp;
        }

        for (int num : array) {
            System.out.print(num + ", ");
        }
    }
}
