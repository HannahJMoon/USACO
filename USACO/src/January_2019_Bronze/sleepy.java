package January_2019_Bronze;
import java.util.*;
import java.io.*;

public class sleepy {
	
	static Scanner in;
	static PrintWriter out;
	static int N;
	static int [] cowOrder;

	public static void main(String[] args) {
		
		init();
		//solve();

	}
	
	public static void init () {
		
		try {
			in = new Scanner (new File ("sleepy.in"));
			N = in.nextInt();
			cowOrder = new int [N];
			for (int i = 0; i < N; i++) {
				cowOrder[i] = in.nextInt();
			}
			
			in.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//public static int solve () {
		
	//}

}
