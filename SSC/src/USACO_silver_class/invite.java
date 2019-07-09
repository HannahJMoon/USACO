package USACO_silver_class;

import java.util.*;

public class invite {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int G = in.nextInt();
	static int ans = 0;
	static HashSet <Integer> [] groups = new HashSet [G];
	
	public static void main(String[] args) {
		
		Queue <Integer> q = new LinkedList <Integer> ();
		
		for (int i = 0; i < G; i++) {
			int temp = in.nextInt();
			for (int j = 0; j < temp; j++) {
				int temp1 = in.nextInt();
				groups[i].add(temp1);
			}
		}
		q.add(1);
		while (!q.isEmpty()) {
			int t = q.remove ();
			for (int i = 0; i < G; i++) {
				if (!groups[i].isEmpty()) {
					groups[i].remove(t);
					if (groups[i].size() == 1) {
						ans++;
						q.add(groups[i].iterator().next());
					}
				}
			}
		}
		System.out.println(ans);
	}

}