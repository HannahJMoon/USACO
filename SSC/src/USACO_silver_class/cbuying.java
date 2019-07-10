package USACO_silver_class;
import java.util.*;

public class cbuying {

	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static long B = in.nextLong();
	static chocolate [] c = new chocolate [N];
	static long scow = 0;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < N; i++) {
			c [i] = new chocolate (in.nextLong(), in.nextLong());
		}
		
		Arrays.sort(c);
		
		for (int a = 0; a < N; a++) {
			long temp = (long) (B / c[a].cost());
			temp = Math.min(temp, c[a].cows());
			scow += temp;
			B -= temp*c[a].cost();
		}
		
		System.out.println(scow);
		
	}

}

class chocolate implements Comparable <chocolate>{
	
	private long cost;
	private long cows;
	
	public int compareTo (chocolate c) {
		if ( this.cost > c.cost) {
			return 1;
		}
		else return -1;
	}

	public chocolate(long c, long cow){
		this.cost = c;
		this.cows = cow;
	}
	
	public long cost () {return cost; }
	public long cows () {return cows; }
	
}