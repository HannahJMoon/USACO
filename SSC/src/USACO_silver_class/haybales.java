package USACO_silver_class;
import java.util.*;
public class haybales {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int [] array = new int [N];
	
	public static void main(String[] args) {
		
		int Q = in.nextInt();
		for (int a = 0; a < N; a++) {
			array [a] = in.nextInt();
		}
		Arrays.sort(array);
		for (int b = 0; b < Q; b++) {
			int ans = 0;
			int temp1 = in.nextInt();
			int temp2 = in.nextInt();
			
			System.out.println(ans);
		}

	}
	
	public static void lowerBound () {
		int l = in.nextInt();
		int h = in.nextInt();
		while (l < h) {
			int mid = (l+h)/2;
			//if (array [] mid >= target) h = mid;
		}
	}

}
