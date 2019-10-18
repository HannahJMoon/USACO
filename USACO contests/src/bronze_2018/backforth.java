package bronze_2018;
import java.util.*;
import java.io.*;

public class backforth {
	
	static Scanner in;
	static PrintWriter out;
	static Set <Integer> week;
	static int [] firstBarn = new int [10];
	static int [] secondBarn = new int [10];
	static int combinations;

	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File ("backforth.in"));
			out = new PrintWriter (new File ("backforth.out"));
			init();
			out.println(solve());
			in.close();
			out.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void init() {
		
		for (int i = 0; i < 10; i++) {
			firstBarn[i] = in.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			secondBarn[i] = in.nextInt();
		}
		
	}
	
	public static int solve () {
		int keep1 [] = firstBarn.clone();
		int keep2 [] = secondBarn.clone();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int curr = 0 - firstBarn[i] + secondBarn[j];
				int temp = firstBarn[i];
				firstBarn [i] = secondBarn [j];
				secondBarn [j] = temp;
				for (int a = 0; a < 10; a++) {
					for (int b = 0; b < 10; b++) {
						int next = curr - firstBarn[a] + secondBarn[b];
						week.add(next);
					}
				}
			}
			firstBarn = keep1.clone();
			secondBarn = keep1.clone();
		}
		return week.size();
	}

}
