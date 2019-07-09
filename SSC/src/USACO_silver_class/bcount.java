package USACO_silver_class;

import java.util.*;

public class bcount {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int Q = in.nextInt();
	static int [] typeCow = new int [N];
	
	public static void main(String[] args) {
		
		for (int i = 0; i < N; i++) {
			 typeCow [i] = in.nextInt();
		}
		for (int i = 0; i < Q; i++) {
			int h = 0;
			int g = 0;
			int j = 0;
			int temp1 = in.nextInt();
			int temp2 = in.nextInt();
			for (int a = temp1-1; a <= temp2 - 1; a++) {
				if (typeCow[a] == 1) h++;
				else if (typeCow[a] == 2) g++;
				else j++;
			}
			System.out.println(h + " " + g +  " " + j);
		}
		
	}

}
