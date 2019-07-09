package USACO_silver_class;
import java.util.*;

public class connect {
	
	static Scanner in = new Scanner(System.in);
	static int N = in.nextInt();
	static int [] xCoor = new int [N+2];
	static int [] yCoor = new int [N+2];
	static int [] num = new int [N+2];
	static boolean [] used = new boolean [N+2];
	static int total = 0;

	public static void main(String[] args) {
		
		for (int i = 1; i <= N; i++) {
			xCoor [i] = in.nextInt();
			yCoor [i] = in.nextInt();
		}
		
		xCoor[0] = 0;
		yCoor[0] = 0;
		xCoor[N+1] = 0;
		yCoor[N+1] = 0;
		num[0] = 0;
		num[N+1] = 0;
		
		f(1);
		System.out.println(total);

	}
	public static void f(int x) {
		if(x == N+1) {
			if (check()) {
				total ++;
//				System.out.println(Arrays.toString(num));
			}
			
			return;
		}
		
		
		for (int i = 1; i <= N; i++) {
			if (used [i] == false) {
				num [x] = i;
				used [i] = true;
				f(x+1);
				used [i] = false;
			}
		}
		
	}
	public static boolean check () {
	
		for (int i = 1; i <= N+1; i++) {
			if (getDir (xCoor[num[i]], yCoor[num[i]], xCoor[num[i-1]], yCoor[num[i-1]]) == -1) return false;
		}
		for (int i = 1; i <= N; i++) {
			if (getDir (xCoor[num[i-1]], yCoor[num[i-1]], xCoor[num[i]], yCoor[num[i]]) == getDir (xCoor[num[i]], yCoor[num[i]], xCoor[num[i+1]], yCoor[num[i+1]])) return false;
		}
		return true;
		
	}

	public static int getDir (int x1, int y1, int x2, int y2) {
		
		if (x1 != x2 && y1 != y2) return -1;
		if (x1 == x2 && y1 < y2) return 1;
		if (x1 < x2 && y1 == y2) return 2;
		if (x1 == x2 && y1 > y2) return 3;
		if (x1 > x2 && y1 == y2) return 4;
		return -1;
		
	}
	
}

