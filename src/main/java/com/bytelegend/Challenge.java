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
        int l = 0, g = 1;
        for (int i = 0; i < n; ++ i) {
            g = l + g;
            l = g - l;
        }
        return l;
    }
}
