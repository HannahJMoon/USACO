package USACO_silver_class;

import java.util.*;

public class stars2 {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		int n = in.nextInt();
		star (n);

	}
	
	public static void star (int n) {
		
		for (int a = 1; a <= n; a++) {
			for (int b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
