/*
ID: hmoon191
LANG: JAVA
TASK: beads
*/
package section1_2;

import java.io.*;
import java.util.*;

public class beads {
	
	static Scanner in;
	static PrintWriter out;
	static int totalbeads;
	static String necklace;
	static int count = 0;

	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File("beads.in"));
			out = new PrintWriter (new File("beads.out"));
			init();
			out.print(solve());
			in.close();
			out.close();
		}
		catch (Exception e) {
			e.printStackTrace();;
		}

	}
	
	public static void init () {
		
		totalbeads = in.nextInt();
		String temp1 = in.next();
		necklace = temp1 + temp1;
		
	}
	
	public static int solve () {
		
		char currColor;
		char nextColor;
		
		for (int i = 0; i < totalbeads; i++) {
			currColor = necklace.charAt(i);
			int change = currColor == 'w' ? 0:1;
			int currCount = 0;
			for (int j = i; j < i+totalbeads; j++) {
				
				nextColor = necklace.charAt(j);
				if (nextColor == 'w' || nextColor == currColor) {
					currCount++;
				}
				else {
					change++;
					if (change > 2) break;
					currCount++;
					currColor = nextColor;
				}
			}
			count = Math.max(count, currCount);
		}
		
		return count;
		
	}
	

}
