package com.bytelegend;

import java.util.HashMap;
import java.util.Map;

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
    private final static Map<Integer, Integer> fiboCache = new HashMap<>() {{
		put(0, 0);
		put(1, 1);
	}};

	public static int fibonacci(int n) {
		if(n == 0 || n == 1) return n;


		int right = fiboCache.getOrDefault(n - 1, fiboCache.putIfAbsent(n - 1, fibonacci(n - 1)));

		if(fiboCache.containsKey(n - 1)) {
			right = fiboCache.get(n - 1);
		} else {
			right = fibonacci(n - 1);
			fiboCache.put(n - 1, right);
		}

		int left = fiboCache.get(n - 2);

		return left + right;
	}
}
