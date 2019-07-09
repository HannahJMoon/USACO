package USACO_silver_class;

import java.util.*;

public class stacking {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int K = in.nextInt();
	static int [] s = new int [N+1];

	public static void main(String[] args) {
		
		for (int i = 0; i < K; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			s[l] ++;
			s[r] --;
		}
		int [] prefSum = new int [N+1];
		for (int i = 1; i < N+1; i++) {
			prefSum [i] = prefSum [i-1] + s[i];
		}
		Arrays.sort(prefSum);
		System.out.println(prefSum[N/2]);

	}

}
