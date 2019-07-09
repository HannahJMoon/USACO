package USACO_silver_class;

import java.util.*;

public class sigma {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println(sig(in.nextInt()));

	}
	
	public static int sig (int n) {
		int total =0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		return total;
	}

}
