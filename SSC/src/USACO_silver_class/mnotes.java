package USACO_silver_class;

import java.util.*;

public class mnotes {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int [] song;
	static int Q = in.nextInt();

	public static void main(String[] args) {
		
		for (int i = 1; i <= N; i++) {
			song [i] = song[i-1]+in.nextInt();
			System.out.println(song [i]);
		}
		
		for (int i = 0; i < Q; i++) {
			int target = in.nextInt();
			System.out.println(upperBound(target));
		}
		
	}
	
	static int lowerBound (int target) {
		int l = 0;
		int h = song.length;
		while (l < h) {
			int mid = (l + h) / 2;
			if (song [mid] >= target) {
				h = mid;
			}
			else l = mid+1;
		}
		return h;
	}
	
	static int upperBound (int target) {
		int l = 0;
		int h = song.length;
		while (l < h) {
			int mid = (l + h) / 2;
			if (song [mid] > target) {
				h = mid;
			}
			else l = mid + 1;
		}
		return h;
	}
	

}
