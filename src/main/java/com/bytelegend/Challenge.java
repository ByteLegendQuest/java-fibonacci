package com.bytelegend;

public class Challenge {

    private static int[] num = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(1));
    }

    // fibonacci(0) = 0
    // fibonacci(1) = 1
    // fibonacci(2) = 1
    // fibonacci(3) = 2
    // ...
    // fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
    public static int fibonacci(int n) {
        return num[n];
    }
}
