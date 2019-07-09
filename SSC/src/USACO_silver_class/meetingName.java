package USACO_silver_class;

import java.util.*;

public class meetingName {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static TreeMap <String, Integer> hmap = new TreeMap <String, Integer>();

	public static void main(String[] args) {
		in.nextLine();
		String Name="";
		int max = 0;
		for (int i = 0; i < N; i++) {
			String name = in.nextLine();
			if (hmap.containsKey(name)) {
				int temp = hmap.get(name);
				hmap.put(name, temp+1);
			}
			else hmap.put(name, 1);
			if(max < hmap.get(name)) {
				max = hmap.get(name);
				Name = name;
			} else if(max == hmap.get(name) && Name.compareTo(name) > 0) {
				Name = name;
			}
		}
		System.out.println(Name + " " + max);
	}

}
