package USACO_silver_class;
import java.util.*;

public class cowflix {

	static Scanner in = new Scanner(System.in);
	static int capacity = in.nextInt();
	static int N = in.nextInt();
	static int[] weights = new int [N+1];
	static int[] a = new int [N+1];
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= N; i++) {
			weights [i] = in.nextInt();
		}
		
		Arrays.sort (weights);
		subset (1,0);
		int maxWeight = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > maxWeight) maxWeight = list.get(i);
		}
		
		System.out.println(maxWeight);
		
	}
	
	public static void subset (int x, int c) {
		if (x == N+1) {
			if (c <= capacity) list.add(c);
			return;
		}
		a[x] = 0;
		subset (x + 1, c);
		a[x] = 1;
		subset (x + 1, c + weights[x]);
	}
	
}