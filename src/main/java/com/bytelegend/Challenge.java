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
        int[] temp = new int[3];
        temp[1] = 1;
        temp[2] = 1;
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            for (int i = 2; i < n; i++) {
                temp[0] = temp[1];
                temp[1] = temp[2];
                temp[2] = temp[0] + temp[1];
            }
            return temp[2];
        }
    }
}
