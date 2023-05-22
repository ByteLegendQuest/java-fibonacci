package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(10));
    }

    // fibonacci(0) = 0 ok
    // fibonacci(1) = 1 ok
    // fibonacci(2) = 1
    // fibonacci(3) = 2
    // ...
    // fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
    public static int fibonacci(int n) {
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
