package USACO_silver_class;

import java.util.*;

public class fibonacci {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println(fib(in.nextInt()));

	}
	
	public static int fib (int n) {
		if (n <= 1) return n;
	    return fib(n - 2) + fib(n - 1);
	}

}
