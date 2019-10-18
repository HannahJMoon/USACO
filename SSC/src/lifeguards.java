import java.util.*;

public class lifeguards {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int ans = 0;
	static lifeguard [] l = new lifeguard [(2*N)+1];
	static TreeSet <Integer> active = new TreeSet <Integer>();

	public static void main(String[] args) {
		
		for (int i = 1; i <= (N*2); i++) {
			if (i % 2 == 1) {
				l[i] = new lifeguard (i/2+1, in.nextInt());
			}
			else {
				l[i] = new lifeguard (i/2, in.nextInt());
			}
		}
		Arrays.sort(l, 1, 2*N +1);
		active.add(l[1].ind);
		int st = l[1].time;
		int total = 0;
		int [] H = new int [N+1];
		for (int i = 2; i <= 2*N; i++) {
			if (active.size() == 1) {
				H[active.first()] += l[i].time - st;
			}
			if (active.size() > 0) total += l[i].time - st;
			if (active.contains(l[i].ind)) {
				active.remove(l[i].ind);	
			}
			else { 
				active.add(l[i].ind);
			}
			st = l[i].time;
		}
		Arrays.sort(H);
		System.out.println(total - H[1]);
		
	}

}

class lifeguard implements Comparable <lifeguard>{
	
	int ind;
	int time;
	
	public int compareTo (lifeguard c) {
		return this.time - c.time;
	}
	
	public lifeguard(int i, int t){
		this.time = t;
		this.ind = i;
	}
	
}
