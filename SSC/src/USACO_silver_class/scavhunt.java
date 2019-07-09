package USACO_silver_class;
import java.io.*;
import java.util.*;

public class scavhunt {
	
	static Scanner in = new Scanner (System.in);
	static int P;
	static int Q;
	static int [] xCoor;
	static int [] yCoor;
	
	public static void main(String[] args) {
		
		try {
		      init();
		      solve();
		}

		catch(Exception e){
		      e.printStackTrace();
		}

	}
	
	public static void init () {
		
		P = in.nextInt();
		Q = in.nextInt();
		
	}
	
	public static void solve () {
		int k = 0;
		int temp = 0;
		for (int i = 1; i <= P; i++) {
			if (P % i == 0) {
				temp++;
			}
		}
		xCoor = new int [temp];
		temp = 0;
		for (int i = 1; i <= Q; i++) {
			if (Q % i == 0) {
				temp++;
			}
		}
		yCoor = new int [temp];
		for (int i = 1; i <= P; i++) {
			if (P % i == 0) {
				xCoor[k] = i;
				k++;
			}
		}
		k = 0;
		for (int i = 1; i <= Q; i++) {
			if (Q % i == 0) {
				yCoor[k] = i;
				k++;
			}
		}
		for (int i = 0; i < xCoor.length; i++) {
			for (int j = 0; j < yCoor.length; j++) {
				System.out.println(xCoor [i] + " " + yCoor [j]);
			}
		}
	}

}
