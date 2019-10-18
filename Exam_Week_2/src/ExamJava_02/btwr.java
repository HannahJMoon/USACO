package ExamJava_02;

import java.util.*;

public class btwr {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static barrel [] barrels = new barrel [N];
	static int total = 1;

	public static void main(String[] args) {
		
		for (int i = 0; i < N; i++) {
			barrels [i] = new barrel (in.nextInt(), in.nextInt());
		}
		int w = 0;
		int b = 0;
		Queue <Integer> W = new LinkedList <Integer> ();
		Queue <Integer> B = new LinkedList <Integer> ();
		for (int i = 0; i < N; i++) {
			
			if (w < barrels[i].w && b < barrels[i].b) {
				w = barrels[i].w;
				b = barrels[i].b;
			}
			W.add(barrels[i].w);
			B.add(barrels[i].b);
		}
		W.remove(w);
		B.remove(b);
		for (int i = W.size()-1; i > 0; i--) {
			for (int a = 0; a < W.size(); a++) {
				if (w < barrels[i].w && b < barrels[i].b) {
					w = barrels[i].w;
					b = barrels[i].b;
				}
			}
			if (barrels[i].w < w && barrels[i].b < b) {
				w = barrels[i].w;
				b = barrels[i].b;
				total++;
			}
			W.remove(w);
			B.remove(B);
			i = 0;
		}
		System.out.println(total);
	}

}

class barrel {
	
	int w, b;
	
	public barrel (int W, int B) {
		this.w = W;
		this.b = B;
	}
	
	public int getX () {return w; }
	public int getY () {return b; }
	
}
