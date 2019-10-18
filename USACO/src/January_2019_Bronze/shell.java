package January_2019_Bronze;
import java.util.*;
import java.io.*;

public class shell {
	
	static Scanner in;
	static PrintWriter out;
	static int N;
	static int [] swaps;
	static int [] a;
	static int [] b;
	static int [] g;

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
		
		in = new Scanner (new File ("shell.in"));
		out = new PrintWriter (new File ("shell.out"));
		N = in.nextInt();
		swaps = new int [3];
		a = new int [N];
		b = new int [N];
		g = new int [N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt() -1;
			b[i] = in.nextInt() -1;
			g[i] = in.nextInt() -1;
		}
		
	}
	
	public static int solve () {
		
		int max = 0;
		for (int i = 0; i < 3; i++) {
			swaps [i] = 1;
			int temp = game (i);
			if (temp > max) {
				if (temp > max) max = temp;
			}
			swaps = new int [3];
		}
		return max;
		
	}
	
	public static int game (int index) {
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			int temp1 = swaps [a[i]];
			int temp2 = swaps [b[i]];
			swaps [a[i]] = temp2;
			swaps [b[i]] = temp1;
			if (swaps[g[i]] == 1) count++;
		}
		return count;
		
	}
	
}
