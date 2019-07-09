package USACO_silver_class;
import java.util.*;
public class odometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int ans = 0;
		long x = in.nextLong();
		long y = in.nextLong();
		for (int i = 3; i <= 17; i++) {
			for (int j = 0; j <= 9; j++) {
				String [] s = new String [j];
				for (int z = 0; z < s.length; z++) {
					for (int d = 0; d <= 9; d++) {
						if (j==d) continue;
						long num = 0;
						for (int r = 0; r < s.length; r++) {
							num = num * 10 + Long.parseLong(s[r]);
						}
						if (s [0].equals("0") == false && x <= num && num <= y) ans++;
					} 
					s[z] = '0' + Integer.toString(j);
				}
			}
		}
		System.out.println(ans);
	}

}
