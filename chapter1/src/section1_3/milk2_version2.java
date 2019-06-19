
/*
ID:hmoon191
LANG:JAVA
TASK:milk2
 */

package section1_3;

import java.io.*;
import java.util.*;

public class milk2_version2 {
	
	static Scanner in;
	static PrintWriter out;
	static int n;
	static int gap = 0;
	static int milking = 0;
	static TreeSet <Integer> set = new TreeSet <Integer>();
	
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
		for (int i = 0; i < n; i++) {
			int start = in.nextInt();
			int end = in.nextInt();
			for (int a = start; a < end; a++) {
				set.add(a);
			}
		}
		
	}
	
	public static String solve () {
		
		int c = 0;
		int maxMilking = 0;
		for (int b: set) {
			int next = b;
			if (next-c == 1) {
				milking++;
			}
			else {
				gap = next-c;
				maxMilking = Math.max(maxMilking, milking);
				milking = 0;
			}
			c = next;
		}
		return (maxMilking+1) + " " + (gap-1);
		
	}

}