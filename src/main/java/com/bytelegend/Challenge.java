package com.bytelegend;

public class Challenge {
    private static int[] memo;

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(20));
    }

    public static int fibonacci(int n) {
        memo = new int[n + 1];
        return fibonacciHelper(n);
    }

    private static int fibonacciHelper(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }

        int result;
        if (n <= 2) {
            result = n - 1;
        } else {
            result = fibonacciHelper(n - 1) + fibonacciHelper(n - 2);
        }
        memo[n] = result;

        return result;
    }
}
