// package com.bytelegend;

// public class Challenge {
//     public static void main(String[] args) {
//         System.out.println(fibonacci(1));
//         System.out.println(fibonacci(1));
//     }

//     // fibonacci(0) = 0
//     // fibonacci(1) = 1
//     // fibonacci(2) = 1
//     // fibonacci(3) = 2
//     // ...
//     // fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
//     public static int fibonacci(int n) {
//         return 0;
//     }
// }

package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        fibonacci(1);
        fibonacci(8);
    }

    // fibonacci(0) = 0
    // fibonacci(1) = 1
    // fibonacci(2) = 1
    // fibonacci(3) = 2
    // ...
    // fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
    public static void fibonacci(int n) {
        int a = 0,b = 1,c;
        if (n == 1 || n == 0)
            System.out.println(1);
        else {
            System.out.println(1);
            System.out.println(b);
            for (int i = 0; i < n; i++) {
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}

