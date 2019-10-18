package January_2018_Bronze;

import java.io.*;
import java.util.*;

public class outofplace {
	
	static Scanner in;
	static PrintWriter out;
	static int N;
	static int [] cows;
	static int [] sortedCows;

	public static void main(String[] args) {
		
		try {
			init();
			out.println(solve());
			in.close();
			out.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void init () throws FileNotFoundException {
		
		in = new Scanner (new File ("outofplace.in"));
		out = new PrintWriter (new File ("outofplace.out"));
		N = in.nextInt();
		cows = new int [N];
		sortedCows = new int [N];
		for (int i = 0; i < N; i++) {
			int temp = in.nextInt();
			cows[i] = temp;
			sortedCows[i] = temp;
		}
		Arrays.sort(sortedCows);
		
	}
	
	public static int solve () {
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (cows[i] != sortedCows[i]) {
				ans++;
			}
		}
		return ans-1;
	}

}
