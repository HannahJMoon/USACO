package bronze_2015;

import java.util.*;
import java.io.*;

public class speeding {
	
	static Scanner in;
	static PrintWriter out;
	static int r,b;
	static int [] road = new int [100];
	static int [] bessie = new int [100];

	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File ("speeding.in"));
			out = new PrintWriter (new File ("speeding.out"));
			init();
			out.println(solve());
			in.close();
			out.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public static void init () {
		r = in.nextInt();
		b = in.nextInt();
		for (int i = 0; i < r; i++) {
			int temp1 = in.nextInt();
			int temp2 = in.nextInt();
			for (int a = 0; a < temp1; a++) {
				road [i] = temp2;
			}
		}
		for (int i = 0; i < b; i++) {
			int temp1 = in.nextInt();
			int temp2 = in.nextInt();
			for (int a = 0; a < temp1; a++) {
				bessie [i] = temp2;
			}
		}
	}
	
	public static int solve () {
		int maxOver = 0;
		int currOver = 0;
		for (int i = 0; i < 100; i ++) {
			if (bessie [i] > road [i]) {
				currOver = bessie [i] - road [i];
				maxOver = Math.max (maxOver, currOver);
			}
		}
		return maxOver;
	}

}
