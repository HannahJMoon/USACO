package USACO_silver_class;

import java.util.*;
import java.io.*;
public class timecards {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int cow = in.nextInt();
		int L = in.nextInt();
		int[] cows = new int[cow];
		int[] time = new int[cow];
		
		for(int x= 0; x < L; x++) {
			int c = in.nextInt();
			String w = in.next();
			int hour = in.nextInt();
			int minute = in.nextInt();
			if(w.equals("START")) {
				cows[c-1] = (hour*60) + minute;
			}
			else {
				time[c-1] += ((hour*60) + minute) - cows[c-1];
			}
			
		}
		
		for(int i = 0; i < cow; i++) {
			System.out.println(time[i] / 60 + " " + time[i] % 60);
		}
	}
}