package bronze_2015;

import java.util.*;
import java.io.*;

public class paint {
	
	static Scanner in;
	static PrintWriter out;
	static int a,b,c,d;
	static boolean [] fence = new boolean [100];

	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File ("paint.in"));
			out = new PrintWriter (new File ("paint.out"));
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
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
	}
	
	public static int solve () {
		for (int i = a; i < b; i ++) {
			fence [i] = true;
		}
		for (int i = c; i < d; i++) {
			fence [i] = true;
		}
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (fence [i]) count ++;
		}
		return count;
	}
	
}
