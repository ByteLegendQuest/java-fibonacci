package com.bytelegend;

public class Challenge {
    // 创建一个数组来存储已经计算过的结果
    private static int[] memo;

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(20));
    }

    public static int fibonacci(int n) {
        // 初始化记忆数组
        memo = new int[n + 1];
        return fibonacciHelper(n);
    }

    private static int fibonacciHelper(int n) {
        // 如果已经计算过，直接返回存储的结果
        if (memo[n] != 0) {
            return memo[n];
        }

        // 计算并存储结果
        int result;
        if (n == 1) {
            result = 0;
        } else if (n == 2) {
            result = 1;
        } else {
            result = fibonacciHelper(n - 1) + fibonacciHelper(n - 2);
        }
        memo[n] = result;

        return result;
    }
}

