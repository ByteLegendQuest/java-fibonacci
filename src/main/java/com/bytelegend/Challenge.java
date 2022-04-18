package com.bytelegend;

public class Challenge {
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
        if (n < 2) {
            return n;
        } else {
            int[] a = new int[n];
            a[0] = 0;
            a[1] = 1;
            for (int i = 2; i < n; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
            return a[n - 1];
        }
    }
}
