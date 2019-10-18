import java.io.*;
import java.util.*;

public class cowjog {
	
	static Scanner in = new Scanner (System.in);
	static long N = in.nextLong();
	static long[] cur = new long [(int)N];

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < N; i++) {
			long pos = in.nextLong();
			long speed = in.nextLong();
			cur[i] = speed;
		}
		
		Stack <Long> s = new Stack <Long>();
		s.add(cur[0]);

		for (int i=1; i<N; i++) {
			while (s.size() > 0 && cur[i] < s.peek()) s.pop();
			s.add(cur[i]);
		}
		
		System.out.println(s.size());
	}
}
