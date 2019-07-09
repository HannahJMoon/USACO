package USACO_silver_class;

import java.util.*;

public class angryCows {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int [] P = new int [N];
	static int nrCow = in.nextInt();

	public static void main(String[] args) {
		
		for (int i = 0; i < N; i++) {
			P [i] = in.nextInt();
		}

        Arrays.sort(P);
        
		System.out.println(temp());
		
	}
	
	public static int temp (){
	    int l = 0;
		int h = 500000000;
		
		while (l < h) {
			int mid = (l+h)/2;
			if (verify(mid) == true) {
				h = mid;
			}
			else l = mid +1;
		}
		
	    return h;
	    
	}
	
	public static boolean verify (int R) {
		int ind = P[0] + 2 * R;
		int nr = 1;
		for (int i = 0; i < N; i++) {
			if (P[i] <= ind) continue;
			else {
				ind = P[i] + 2*R;
				nr++;
			}
		}
		if (nr > nrCow) return false;
		else return true;
	}

}
