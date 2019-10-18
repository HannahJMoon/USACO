package bronze_2018;
import java.util.*;
import java.io.*;

public class mixmilk {
	
	static Scanner in;
	static PrintWriter out;
	static int n;
	static long[] buckets = new long[3];
	static long[] bucketCapacities = new long[3];
	
	public static void main(String[] args){
		
		try {
			in = new Scanner (new File ("mixmilk.in"));
			out = new PrintWriter (new File ("mixmilk.out"));
			solve();
			out.println(init());
			in.close();
			out.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static String init() {
		
		String[] line = new String[2];
		for (int i = 0; i < 2; i++) {
			line [i] = Integer.toString(in.nextInt());
		}
		bucketCapacities[0] = Long.parseLong(line[0]);
		buckets[0] = Long.parseLong(line[1]);
		for (int i = 0; i < 2; i++) {
			line [i] = Integer.toString(in.nextInt());
		}
		bucketCapacities[1] = Long.parseLong(line[0]);
		buckets[1] = Long.parseLong(line[1]);
		for (int i = 0; i < 2; i++) {
			line [i] = Integer.toString(in.nextInt());
		}
		bucketCapacities[2] = Long.parseLong(line[0]);
		buckets[2] = Long.parseLong(line[1]);

		String[] result = solve();

		for (int i = 0; i < result.length; i++) {
			return result[i];
		}
		out.close();
		return "";
	}

	public static String[] solve() {

		String[] out = new String[3];
		int bucket, next;
		long amt;

		for (int i = 0; i < 100; i ++) {

			bucket = i % 3;
			next = bucket < 2 ? bucket + 1 : 0;
			amt = Math.min(buckets[bucket], bucketCapacities[next] - buckets[next]);
			buckets[bucket] -= amt;
			buckets[next] += amt;

		}


		for (int i = 0; i < 3; i ++) {
			out[i] = buckets[i] + "";
		}


		return out;
	}
}
