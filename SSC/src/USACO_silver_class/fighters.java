package USACO_silver_class;

import java.util.*;

public class fighters {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		PriorityQueue <Integer> pq = new PriorityQueue <Integer> ();
		int N = in.nextInt();
		int total = 0;
		for (int i = 0; i < N; i++) {
			pq.add(in.nextInt());
		}
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		while (pq.size() != 1) {
			temp1 = 0;
			temp2 = 0;
			temp3 = 0;
			temp1 = pq.remove();
			temp2 = pq.remove();
			temp3 = temp1 + temp2;
			total += temp3;
			pq.add(temp3);
		}
		System.out.println(total);
		
	}

}
