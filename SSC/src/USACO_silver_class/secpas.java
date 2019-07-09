package USACO_silver_class;
import java.io.*;
import java.util.*;

public class secpas {
	
	static Scanner in = new Scanner (System.in);
	static int N;
	static int [] M;

	public static void main(String[] args) {
		
		try {
		      init();
		      System.out.println(solve());
		}

		catch(Exception e){
		      e.printStackTrace();
		}
		
	}
	
	public static void init () {
		N = in.nextInt();
		M = new int [N*N];
	}
	
	public static int solve () {
		int ans = 0;
		for (int a = 0; Math.pow(a, 2) <= N; a++) {
			for (int b = 0; Math.pow (b, 2) <= N; b++) {
				 if(Math.pow(a, 2) + Math.pow(b, 2) <= N){
	                    M[(int)(Math.pow(a, 2)+Math.pow(b, 2))]++;
	             }
			}
		}
		for (int x = 0; x <= N; x++) {
			ans += M[x]*M[N-x];
		}
		return ans;
	}
	
}
