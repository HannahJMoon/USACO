/*
ID: hmoon191
LANG: JAVA
TASK: friday
*/
package section1_2;
import java.io.*;
import java.util.*;

public class friday {
	
	static Scanner in;
	static PrintWriter out;
	static int [] fridays;
	
	public static void main(String [] args) {
		
		try {
			in = new Scanner (new File("friday.in"));
			out = new PrintWriter (new File("friday.out"));
			out.print(solve());
			in.close();
			out.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	private static String solve () {
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int n = in.nextInt();
		int day = 1;
		for (int k =1900 ; k < 1900+n; k++) {
			for (int j = 0; j < 12; j++) {
				int temp=(day+13)%7;
				day=(day+months[j])%7;
		
				if(isLeap(k) && j==1){
					day=(day+29)%7;
				}
				fridays[temp]++;
			}
		}
		
		for(int i = 0; i <= 6; i++) {
			return Integer.toString(fridays[i])+" ";
		}
		return "";
		
	}
	
	static boolean isLeap(int year){
		if(year % 4 == 0 && ((year % 100!=0) || (year % 400) == 0)) return true;
		else return false;
	}

}