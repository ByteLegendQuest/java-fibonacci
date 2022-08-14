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
	private final static Map<Integer, Integer> fiboCache = new HashMap<>();

	public static int fibonacci(int n) {
		if(n == 0 || n == 1) return n;

		int left;
		int right;
		
		if(fiboCache.containsKey(n - 1)) {
			right = fiboCache.get(n - 1);
		} else {
			right = fibonacci(n - 1);
			fiboCache.put(n - 1, right);
		}
		
		if(fiboCache.containsKey(n - 2)) {
			left = fiboCache.get(n - 2);
		} else {
			left = fibonacci(n - 2);
			fiboCache.put(n - 2, left);
		}
		
		return left + right;
	}
}
