package USACO_silver_class;

import java.util.*;

public class moocast {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int [] xCoor = new int [N];
	static int [] yCoor = new int [N];
	static int [] power = new int [N];
	static boolean [] visited = new boolean[N];
	static boolean [] temp = visited.clone();
	static int ans = 0;

	public static void main(String[] args) {

		for (int a = 0; a < N; a++) {
			xCoor [a] = in.nextInt();
			yCoor [a] = in.nextInt();
			power [a] = in.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int c = dfs(i);
			ans = Math.max(ans, c);
			visited = temp.clone();
		}
		System.out.println(ans);
		
	}
	
	public static int dfs (int cur) {
		
		visited [cur] = true;
		int cows = 1;
		for (int i = 0; i < N; i++) {
			if (accessible (cur, i) && !visited [i]) cows += dfs (i);
		}
		return cows;
		
	}
	
	public static boolean accessible (int source, int dest) {
		int dx = xCoor[source] - xCoor[dest];
		int dy = yCoor[source] - yCoor[dest];
		int p = power [source];
		return (p*p) > (dx*dx) + (dy*dy);
	}

}
