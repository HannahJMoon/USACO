package USACO_silver_class;

import java.util.*;

public class practice {
	
	
	static Scanner in = new Scanner (System.in);
	static boolean [] used = new boolean [28];
	static int n = in.nextInt();
	static int m = in.nextInt();
	static int [] num = new int [m];

	public static void main(String[] args) {

		f(0);
	
	}
	
	public static void f (int x) {
		if (x == m) {
		    for (int i = 0; i < m; i++) {
		    	System.out.print(num[i]);
		    }
		    System.out.println();
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (used [i] == false) {
				num [x] = i;
				used [i] = true;
				f(x+1);
				used [i] = false;
			}
		}
	}
	

}
