package USACO_silver_class;

import java.util.*;

public class convention2 {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	

	public static void main(String[] args) {
		
		PriorityQueue<Cows> pq = new PriorityQueue<Cows>();
		Cows [] c = new Cows [N];
		timeCompare tc = new timeCompare();
		for(int i = 0; i < N; i++) {
			int ind = i;
			int timeS = in.nextInt();
			int duration = in.nextInt();
			c[i] = new Cows(ind, timeS, duration);
		}
		Arrays.sort(c, tc);
		Cows active = c[0];
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
				Cows t = pq.remove();
				ans = Math.max (ans, fin - t.getTimeS());
				fin = fin + t.getDuration();
			}
		}
		System.out.println(ans);

	}

}
class Cows implements Comparable <Cows>{
	
	private int ind;
	private int timeS;
	private int duration;
	
	public int compareTo (Cows c) {
		return this.ind - c.ind;
	}
	
	public Cows (int i, int t, int d) {
		this.ind = i;
		this.timeS = t;
		this.duration = d;
	}
	
	public int getInd () {return ind; }
	public int getTimeS () {return timeS; }
	public int getDuration () {return duration; }
}

class timeCompare implements Comparator <Cows> {
	public int compare (Cows a, Cows b) {
		if (a.getTimeS() == b.getTimeS()) return a.getInd() - b.getInd();
		else return a.getTimeS() - b.getTimeS();
	}
}
