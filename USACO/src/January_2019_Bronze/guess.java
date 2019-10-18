package January_2019_Bronze;
import java.util.*;
import java.io.*;

public class guess {
	
	static Scanner in;
	static PrintWriter out;
	static ArrayList <String> [] a;
	static int N;

	public static void main(String[] args) {
		
		init();
		solve();
		
	}
	
	public static void init () {
		
		try {
			in = new Scanner (new File ("guess.in"));
			N = in.nextInt();
			a = new ArrayList [N];
			for (int i = 0; i < N; i++) {
				a[i] = new ArrayList <String> ();
				in.next();
				int k = in.nextInt();
				for (int j = 0; j < k; j++) {
					a[i].add(in.next());
				}
			}
			in.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void solve () {
		
		int max = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				int temp = 0;
				for (String s : a[i]) {
					if (a[j].contains(s)) temp++;
				}
				if (temp > max) max = temp;
			}
		}
		try {
			out = new PrintWriter (new File ("guess.out"));
			out.println(max + 1);
			out.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
