package USACO_silver_class;

import java.util.*;

public class scode {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		String s = in.next();
		System.out.println(f(s)-1);

	}
	
	public static int f (String s) {
		int ans = 1;
		int n = s.length();
		if (n % 2 == 0 && n==1) return 1;
		if (s.substring(0, n/2).equals(s.substring(n/2, n-1))) ans += f(s.substring(n/2, n));
		if (s.substring(0, n/2).equals(s.substring(n/2+1))) ans += f(s.substring(0, n/2+1));
		if (s.substring(0, n/2).equals(s.substring(n/2+1))) ans += f(s.substring(n/2));
		if (s.substring(1, n/2+1).equals(s.substring(n/2+1))) ans += f(s.substring(0, n/2+1));
		return ans;
	}

}
