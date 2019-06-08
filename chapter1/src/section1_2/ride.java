/*
ID: hmoon191
LANG: JAVA
TASK: ride
*/

package section1_2;
import java.util.*;
import java.io.*;
public class ride {
	
	static Scanner in;
	static PrintWriter out;
	static String inFile = "ride.in";
	static String outFile = "ride.out";
	static String result = "";
	static String [] list;
	
	public static void main(String[] args) {
			try {
				in = new Scanner (new File(inFile));
				out = new PrintWriter (new File(outFile));
				init();
				result = solve();
				out.println(result);
				in.close();
				out.close();
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
