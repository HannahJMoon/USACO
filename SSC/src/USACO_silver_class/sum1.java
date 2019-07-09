package USACO_silver_class;

import java.util.*;

public class sum1 {

	static Scanner in = new Scanner (System.in);
	static long N = in.nextLong();
	static long ans ;
	static int MOD = 1000000007;

	public static void main(String[] args) {
		
		ans = pow (N+1);
		System.out.println(ans-1);

	}
	
	public static long pow (long N) {
		if (N == 0) return 1;
		if (N == 1) return 2;
		long x = pow (N/2) % MOD;
		if (N % 2 == 0) return (x*x) % MOD;
		else return (((x*x) % MOD) * 2) % MOD;
	}

}