package org.moldavets;

import java.util.Arrays;

public class StringRadixSort {
    public static void main(String[] args) {
//        String[] array = new String[] {"bcdef", "cbcde","cbcda"};
        String[] array = new String[] {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb","a"};
//        System.out.println(Character.toLowerCase('A') < Character.toLowerCase('Z'));
//        System.out.println();
        stringRadixSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void stringRadixSort(String[] array) {
        String allLetters = "abcdefghijklmnopqrstuvwxyz";
        int max = 0;

        for(int i = 0; i < array.length; i++) {
            max = max < array[i].length() ? array[i].length() : max;
        }

        for (int q = 1; q <= max; q++) {
            int[] bucketCount = new int[26];
            String[][] tempArray = new String[26][array.length];
            for (int i = 0; i < array.length; i++) {
                int digit = array[i].length()-q >= 0 ? allLetters.indexOf(Character.toLowerCase(array[i].charAt(array[i].length()-q)))+1 : 0;
                tempArray[digit][bucketCount[digit]++] = array[i];
            }

            int n = 0;
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < bucketCount[i]; j++) {
                    array[n++] = tempArray[i][j];
                }
            }
        }
    }
}
