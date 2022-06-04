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
        int sum = 0;
        if (n == 1) {
            return sum + 1;
        }
        if (n == 0) {
            return sum;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
