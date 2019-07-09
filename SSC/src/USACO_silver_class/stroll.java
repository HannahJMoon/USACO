package USACO_silver_class;

import java.util.*;

public class stroll {
	
	static Scanner in = new Scanner (System.in);
	static int P = in.nextInt();
	static int [] L = new int [P];
	static int [] R = new int [P];
	static int ans = 0;

	public static void main(String[] args) {
		
		for (int a = 0; a < P-1; a++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			L[x] = y;
			R[x] = z;
		}
		
		dfs (1, 0);
		System.out.println(ans);

	}
	
	public static void dfs (int curr, int depth) {
		
		if (curr == 0) {
			if (depth > ans) {
				ans = depth;
			}
			return;
		}
		dfs (L[curr], depth+1);
		dfs (R[curr], depth+1);
		
	}

}
