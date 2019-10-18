/*
ID:hmoon191
LANG:JAVA
TASK:milk2
 */

package section1_3;

import java.io.*;
import java.util.*;

public class milk2 {
	
	static Scanner in;
	static PrintWriter out;
	static int n;
	static int gap;
	static int milking;
	static Set <Integer> set;
	
	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File ("milk2.in"));
			out = new PrintWriter (new File ("milk2.out"));
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
		
		n = in.nextInt();
		set = new HashSet <Integer>();
		for (int i = 0; i < n; i++) {
			int start = in.nextInt();
			int end = in.nextInt();
			for (int a = start; a < end; a++) {
				set.add(a);
			}
		}
		
	}
	
	public static String solve () {
		
		ArrayList <Integer> a = new ArrayList<Integer>();
		a.addAll(set);
		int c = a.get(0);
		int maxMilking = 0;
		int maxGap = 0;
		milking = 0;
		gap = 0;
		for (int next: a) {
			
			if (next-c <= 1) {
				milking++;
				gap = 0;
			}
			else {
				gap = next-c-1;
				milking = 0;
			}
			c = next;
			maxGap = Math.max(gap, maxGap);
			maxMilking = Math.max(maxMilking, milking);
		}
		return maxMilking + " " + maxGap;
		
	}

}