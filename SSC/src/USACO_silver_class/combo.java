package USACO_silver_class;
import java.util.*;

import java.util.Scanner;

public class combo {
	
	static Scanner in = new Scanner (System.in);
	static int total = 0;
	static int n = in.nextInt();
	static int [] john = new int [3];
	static int [] master = new int [3];
	static int [] a = new int [3];

	public static void main(String[] args) {
		john [0] = in.nextInt();
		john [1] = in.nextInt();
		john [2] = in.nextInt();
		master [0] = in.nextInt();
		master [1] = in.nextInt();
		master [2] = in.nextInt();

		combos (0);
		
		System.out.println(total);
		
	}
	
	public static void combos (int x) {
		
		if (x == 3) {
			if (valid (a)) total ++;
			return ;
		}
		for (int i = 1; i <= n; i++) {
			a[x] = i;
			combos (x+1);
		}
		
	}
	
	public static boolean valid (int [] a) {
		if (close (a[0], john [0]) && close (a[1], john [1]) && close (a[2], john[2])) return true;
		if (close (a[0], master [0]) && close (a[1], master [1]) && close (a[2], master[2])) return true;
		return false;
	}
	
	public static boolean close (int a, int b) {
		if (Math.abs(a-b) <= 2 || Math.abs(a-b) >= n-2) return true;
		return false;
	}
	
}
