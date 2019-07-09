package USACO_silver_class;
import java.io.*;
import java.util.*;
public class relay {
	
	static int N;
	static Scanner in = new Scanner (System.in);
	static int [] nonloopy;
	static int [] visited;
	static int [] f;

	public static void main(String[] args) {
		
		try {
			init();
			System.out.println(solve());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void init () {
		
		N = in.nextInt();
		for (int i= 0; i < N; i++) {
			f[i] = in.nextInt();
		}
		
	}
	public static int solve () {
		return 3;
	}

}
