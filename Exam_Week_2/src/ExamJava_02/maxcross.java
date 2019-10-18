package ExamJava_02;

import java.util.*;

public class maxcross {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int K = in.nextInt();
	static int B = in.nextInt();
	static int total  = 0;
	static int [] lights = new int [B];

	public static void main(String[] args) {
		
		for (int i = 0; i < B; i++) {
			lights[i] = in.nextInt();
		}
		Arrays.sort(lights);
		int leastDiff = lights[0];
			for (int i = 1; i < B; i++) {
				if (lights[i]-lights[i-1] < leastDiff) {
					leastDiff = lights[i]-lights[i-1];
				}
			}
		System.out.println(leastDiff);
	}

}
