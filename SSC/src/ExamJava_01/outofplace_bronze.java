package ExamJava_01;
import java.util.*;
import java.io.*;

public class outofplace_bronze {

	final public static int MAX = 1000000;
	static Scanner in = new Scanner (System.in);
	public static void main(String[] args) throws Exception {
		
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		int badIndex = -1;
		for (int i=1; i<n; i++) {
			if (arr[i] < arr[i-1]) {
				badIndex = i;
				break;
			}
		}

		HashSet<Integer> skip = new HashSet<Integer>();
		if (badIndex != -1) {
			if (badIndex == n-1 || (badIndex < n-1 && arr[badIndex-1] <= arr[badIndex+1])) {

				int i = badIndex-1;

				while (i >= 0 && arr[i] > arr[badIndex]) {
					skip.add(arr[i]);
					i--;
				}
			}

			else {

				int i = badIndex;

				while (i < n && arr[i] < arr[badIndex-1]) {
					skip.add(arr[i]);
					i++;
				}
			}
		}
		System.out.println(skip.size());
	}
}