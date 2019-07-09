package USACO_silver_class;

import java.util.*;

public class baseball {

	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int [] v = new int [N];
	

	public static void main(String[] args) {
		
		int ans = 0;
		for (int x = 0; x < N; x++) {
			v[x] = in.nextInt();
		}
		
		Arrays.sort(v);
		
		for (int x = 0; x < N; x++) {
			for (int y = x+1; y < N; y++) {
				int target = v[y] + (v[y] - v[x]);
				int a = lowerBound (target);
				target = v[y] + 2*(v[y] - v[x]);
				int b = upperBound (target);
				ans += b-a;
			}
		}
		
		System.out.println(ans);
	}
	static int lowerBound (int target) {
		int l = 0;
		int h = N;
		while (l < h) {
			int mid = (l + h) / 2;
			if (v [mid] >= target) {
				h = mid;
			}
			else l = mid+1;
		}
		return h;
	}
	
	static int upperBound (int target) {
		int l = 0;
		int h = N;
		while (l < h) {
			int mid = (l + h) / 2;
			if (v [mid] > target) {
				h = mid;
			}
			else l = mid + 1;
		}
		return h;
	}

}
