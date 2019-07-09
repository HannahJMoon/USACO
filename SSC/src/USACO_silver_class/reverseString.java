package USACO_silver_class;

import java.util.*;

import java.util.Scanner;

public class reverseString {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		String word = in.next();
		String [] str = word.split("");
		reverse (str);

	}
	
	public static void reverse (String [] str) {
		for (int i = str.length-1; i >= 0; i--) {
			System.out.print(str[i]);
		}
	}

}
