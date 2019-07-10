import java.util.*;

public class iou {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt(); 
	static int [] cows = new int [N];
	static int ans = 0;

	public static void main(String[] args) {
		
		for (int i = 0; i < N; i++) {
			cows [i] = in.nextInt();
		}
		int B = 0;
		int totalDebt = 0;
		int posFirstDebt = -1;
		for (int i = 0; i < N; i++) {
			ans++;
			if (cows[i] > 0) {
				B +=  cows[i];
			}
			if (cows[i] < 0) {
				if (posFirstDebt == -1) {
					posFirstDebt = i;
				}
				totalDebt += cows[i] * -1;
			}
			if (B >= totalDebt && totalDebt != 0) {
				B -= totalDebt;
				totalDebt = 0;
				ans += (i - posFirstDebt) * 2;
				posFirstDebt = -1;
			}
		}
		System.out.println(ans);
	}

}
