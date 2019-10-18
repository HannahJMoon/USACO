package January_2017_Bronze;

import java.io.*;
import java.util.*;

public class notlast {
	
	static Scanner in;
	static PrintWriter out;
	static int N;

	public static void main(String[] args) {
		
		try {
			init();
			out.println(solve());
			in.close();
			out.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void init () throws FileNotFoundException {
		
		in = new Scanner (new File ("hps.in"));
		out = new PrintWriter (new File ("hps.out"));
		N = in.nextInt();
		
		
	}
	
	public static int solve () {
		int ans = 0;
		return ans;
	}

}
