package USACO_silver_class;
import java.io.*;
import java.util.*;

public class cowmult {
	
	static Scanner in = new Scanner (System.in);
	static String [] A;
	static String [] B;

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
		String temp1 = Integer.toString(in.nextInt());
		String temp2 = Integer.toString(in.nextInt());
		int lengthA = temp1.length();
		int lengthB = temp2.length();
		A = new String [lengthA];
		B = new String [lengthB];
		for (int i = 0; i < lengthA; i++) {
			char temp = temp1.charAt(i);
			String t = Character.toString(temp);
			A [i] = t;
		}
		for (int i = 0; i < lengthB; i++) {
			char temp = temp2.charAt(i);
			String t = Character.toString(temp);
			B [i] = t;
		}
	}
	
	public static int solve() {
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				int temp1 = Integer.parseInt(A [i]);
				int temp2 = Integer.parseInt(B [j]);
				ans = ans + (temp1 * temp2);
			}
		}
		return ans;
	}

}
