package USACO_silver_class;

import java.util.*;

public class path1 {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int [][] map = new int [N][N];
	static int ans = 0;
	
	public static void main(String[] args) {
		
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < N; b++) {
				map [a][b] = in.nextInt();
			}
		}
		
		dfs (0, 0);
		
		System.out.println(ans);

	}
	
	public static void dfs (int row, int column) {
		
		if (row == N-1 && column == N-1) {
			ans++;
			return;
		}
		if ((row != N-1) && map [row+1][column] != 1) {
			dfs (row+1, column);
		}
		if ((column != N-1) && map [row][column+1] != 1) {
			dfs (row, column+1);
		}
		
	}

}