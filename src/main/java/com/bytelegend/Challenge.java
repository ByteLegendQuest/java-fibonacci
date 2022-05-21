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
        /*
         *   int [] intArray0 ;
         *   intArray0 = new int[n+1];
         *   intArray0[0] = 0;
         *   intArray0[1] = 1;
         *   for(int i = 2; i < n+1; i++){
         *       intArray0[i] = intArray0[i-1] + intArray0[i-2];
         *   }
         */
        int res = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        else {
            int n1 = 0;
            int n2 = 1;
            for (int i = 2; i < n + 1; i++) {
                res = n1 + n2;
                n1 = n2;
                n2 = res;
            }
        }

        return res;
        //return intArray0[n];
    }
}
