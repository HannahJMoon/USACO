/*
ID:hmoon191
LANG:JAVA
TASK:milk2
 */


package section1_3;
import java.util.*;
import java.io.*;
public class milk2 {
	
	static Scanner in;
	static PrintWriter out;
	static int n;
	static Pair a[];

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
		a = new Pair [n];
		for (int i = 0; i < n; i++) {
			a [i] = new Pair (in.nextInt(), in.nextInt());
		}
		Arrays.sort(a);
	}
	
	public static String solve () {
		int start = a[0].s;
		int end = a[0].e;
		int gap = 0;
		int milking = 0;
		for (int i = 1; i < n; i++) {
			int nextS = a[i].s;
			int nextE = a[i].e;
			if (nextS <= end) {
				if (end <= nextE) {
					end = nextE;
				}
			}
			else {
				gap = Math.max(gap, nextS-end);
				milking = Math.max(milking, end-start);
				start = nextS;
				end = nextE;
			}
		}
		milking = Math.max(milking, end-start);
		return milking + " " + gap;
	}

}

class Pair implements Comparable <Pair>{
	int s;
	int e;
	Pair (int x, int y) {
		s = x;
		e = y;
	}

	@Override
	public int compareTo(Pair that) {
		if (this.s > that.s) return 1;
		else return -1;
	}
	
	public String toString () {
		return s + " " + e;
	}
	
}
