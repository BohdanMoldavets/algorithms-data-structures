package org.moldavets;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int num) {
        return num < 1 ? 1 : num * (factorial(num-1));
    }
}
