package USACO_silver_class;
import java.util.*;

public class assign {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int K = in.nextInt();
	static int [] a = new int [N+1];
	static int ans = 0;
	static cow [] cows = new cow [K]; 

	public static void main(String[] args) {
		
		in.nextLine();
		for (int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(in.nextLine());
			cows [i] = new cow (st.nextToken().charAt(0), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())); 
		}
		f(1);
		System.out.println(ans);

	}
	
	public static void f (int x) {
		if (x == N+1) {
			if (valid()) {
			    ans++;
			}
			return;
		}
		for (int i = 1; i <= 3; i++) {
			a[x] = i;
			f(x+1);
		}
	}

	public static boolean valid () {
		for (int i = 0; i < K; i++) {
			if (cows [i].character == 'S') {
				if (a[cows[i].first] != a[cows[i].second]) {
					return false;
				}
			}
			else {
				if (a[cows[i].first] == a[cows[i].second]) {
					return false;
				}
			}
		}
		return true;
	}
	
}

class cow {
	char character ;
	int first;
    int second;
	public cow (char c, int f, int s) {
		this.character = c;
		this.first = f;
		this.second = s;
	}
	public char getC() {return character;}
	public int getF() {return first;}
	public int getS() {return second;}
}
