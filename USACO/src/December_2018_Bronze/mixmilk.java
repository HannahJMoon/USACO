package December_2018_Bronze;
import java.io.*;
import java.util.*;

class mixmilk {
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("mixmilk.in"));
		PrintWriter out = new PrintWriter(new File ("mixmilk.out"));

		long[] buckets = new long[3];
		long[] bucketCapacities = new long[3];

		String[] line = in.nextLine().split(" ");
		bucketCapacities[0] = Long.parseLong(line[0]);
		buckets[0] = Long.parseLong(line[1]);
		line = in.nextLine().split(" ");
		bucketCapacities[1] = Long.parseLong(line[0]);
		buckets[1] = Long.parseLong(line[1]);
		line = in.nextLine().split(" ");
		bucketCapacities[2] = Long.parseLong(line[0]);
		buckets[2] = Long.parseLong(line[1]);

		String[] result = solve(buckets, bucketCapacities);

		for (int i = 0; i < result.length; i++) {
			out.println(result[i]);
		}
		out.close();
	}

	public static String[] solve(long[] buckets, long[] bucketCapacities) {

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
