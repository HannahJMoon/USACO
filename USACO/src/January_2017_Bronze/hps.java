package January_2017_Bronze;

import java.io.*;
import java.util.*;

public class hps {
	
	static Scanner in;
	static PrintWriter out;
	static int N;
	static int [] results;
	
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
		
		in = new Scanner (new File ("hps.in"));
		out = new PrintWriter (new File ("hps.out"));
		N = in.nextInt();
		results = new int [N];
		for (int i = 0; i < N; i++) {
			results [i] = in.nextInt() - in.nextInt();
		}
		
	}
	
	public static int solve () {
		
		int ans1 = 0;
		int ans2 = 0;
		for (int i = 0; i < N; i++) {
			if (results[i] == -1 || results[i] == 2) ans1++;
			else if (results[i] == -2 || results [i] == 1) ans2++;
		}
		int max = Math.max(ans1, ans2);
		return max;
		
	}

}
