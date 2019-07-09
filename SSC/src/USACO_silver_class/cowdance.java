package USACO_silver_class;

import java.util.*;

public class cowdance {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int Tmax = in.nextInt();
	static int [] cows = new int [N];

	public static void main(String[] args) {
		
		for (int i = 0; i < N; i++) {
			cows [i] = in.nextInt();
		}
		System.out.println(BS(0,N-1));

	}
	
	public static int BS(int l, int h) {
		while (l < h) {
			int mid = (l+h)/2;
			if (isOk(mid)) h = mid;
			else l = mid +1;
		}
		return h;
	}
	
	static boolean isOk (int mid) {
		
		int time = 0;
		PriorityQueue <Integer> pq = new PriorityQueue <Integer> ();
		for (int i = 0; i < N; i++) {
			if (pq.size() == mid) {
				time = pq.remove();
			}
			pq.add(time + cows[i]);
			if (time + cows[i] > Tmax) return false;
		}
		return true;
		
	}

}
