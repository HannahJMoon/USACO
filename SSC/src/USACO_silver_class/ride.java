package USACO_silver_class;

import java.io.*;
import java.util.*;

public class ride {
	
	static Scanner in = new Scanner (System.in);
	static String result = "";
	static String [] list;
	
	public static void main(String[] args) {
			try {
				init();
				result = solve();
				System.out.println(result);
			}
			catch(Exception e){
				System.out.println(e);
			}
	}
	
	static void init () {
		list = new String [2];
		list [0] = in.nextLine();
		list [1] = in.nextLine();
	}
	
	static String solve () {
		int n1 = convert (list [0]);
		int n2 = convert (list [1]);
		if (n1 == n2) return "GO";
		else return "STAY";
	}
	static int convert (String s) {
		int temp = 1;
		for (int i = 0; i < s.length(); i++) {
			temp *= s.charAt(i) - 'A' + 1;
		}
		return temp % 47;
	}

}
