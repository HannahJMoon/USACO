package USACO_silver_class;

import java.util.*;

public class convention2 {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	

	public static void main(String[] args) {
		
		PriorityQueue<bleh> pq = new PriorityQueue<bleh>();
		bleh [] c = new bleh [N];
		timeCompare tc = new timeCompare();
		for(int i = 0; i < N; i++) {
			int ind = i;
			int timeS = in.nextInt();
			int duration = in.nextInt();
			c[i] = new bleh(ind, timeS, duration);
		}
		Arrays.sort(c, tc);
		bleh active = c[0];
		int nr = 1;
		int ans = 0;
		int fin = active.getTimeS() + active.getDuration();
		while (nr < N || pq.size() > 0) {
			while (nr < N && c[nr].getTimeS() <= fin) {
				pq.add(c[nr]);
				nr++;
			}
			if (nr < N && pq.size() == 0) {
				fin = c[nr].getTimeS() + c[nr].getDuration();
				nr++;
			}
			else if (pq.size() > 0) {
				bleh t = pq.remove();
				ans = Math.max (ans, fin - t.getTimeS());
				fin = fin + t.getDuration();
			}
		}
		System.out.println(ans);

	}

}
class bleh implements Comparable <bleh>{
	
	private int ind;
	private int timeS;
	private int duration;
	
	public int compareTo (bleh c) {
		return this.ind - c.ind;
	}
	
	public bleh (int i, int t, int d) {
		this.ind = i;
		this.timeS = t;
		this.duration = d;
	}
	
	public int getInd () {return ind; }
	public int getTimeS () {return timeS; }
	public int getDuration () {return duration; }
}

class timeCompare implements Comparator <bleh> {
	public int compare (bleh a, bleh b) {
		if (a.getTimeS() == b.getTimeS()) return a.getInd() - b.getInd();
		else return a.getTimeS() - b.getTimeS();
	}
}
