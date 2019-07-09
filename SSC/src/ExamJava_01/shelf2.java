package ExamJava_01;

import java.util.*;
import java.io.*;

public class shelf2 {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int N = in.nextInt();
		int b = in.nextInt();
		int diff = 0;
		int [] heights = new int [N];
		for (int i = 0; i < N; i++) {
			heights [i] = in.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int tempSum = 0;
			for (int a = i; a < N; a++) {
				tempSum = tempSum + heights [a];
				if (tempSum > sum && tempSum < b) {
					diff = b-tempSum;
					sum = tempSum;
				}
				
			}
		}
		System.out.println(diff);
	}

}
