package com.bytelegend;

import java.util.ArrayList;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(1));
    }

    public static int fibonacci(int n) {
        List<Integer> fibonacci = new ArrayList<Integer>();
        
        for(int i = 0; i<=n; i++) {
        	if(i==0 || i==1)
        		fibonacci.add(i);
        	else {
        		fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
        	}
        }
        
        return fibonacci.get(n);
    }
}
