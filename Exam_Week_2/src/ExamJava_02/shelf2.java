package ExamJava_02;

import java.util.*;

public class shelf2 {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int B = in.nextInt();
	static int [] heights = new int [N];
	static int height = B;

	public static void main(String[] args) {
		
		for (int i = 0; i < N; i++) {
			heights [i] = in.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			check(i);
		}
		if (height < 0) height = height * -1;
		System.out.println(height-1);
	}
	
	public static void check (int i) {
		for (int a = 1; a <= i; a++) {
			int temp = 0;
			int temp1 = 0;
			for (int b = a; b <= i; b++) {
				temp += heights[b-1];
			}
			temp1 = B-temp;
			if (temp1 < height) {
				height = temp1;
			}
		}
	}

}
