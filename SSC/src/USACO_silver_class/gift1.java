package USACO_silver_class;
import java.io.*;
import java.util.*;
public class gift1 {
	
	static Scanner in = new Scanner (System.in);
	static PrintWriter out;
	static Map <String,Integer> list;
	static StringBuilder result;
	static int n;
	
	public static void main(String[] args) {
		try {
			init();
			System.out.println(solve());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static void init () {
		n = in.nextInt();
		list = new LinkedHashMap<String,Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			list.put(name, 0);
		}
	}
	
	private static String solve () {
		for (int i = 0; i < n; i++) {
			String giver = in.next();
			int totalmoney = in.nextInt();
			int distribute = in.nextInt();
			if (distribute == 0) {
				continue;
			}
			int eachperson = totalmoney/ distribute;
			int remainder = totalmoney % distribute;
			for (int a = 0; a < distribute; a++) {
				String temp = in.next();
				list.put(temp, list.get(temp)+eachperson);
			}
			list.put(giver, list.get(giver)-totalmoney+remainder);
		}
		result = new StringBuilder();
		for (String key : list.keySet()) {
			result.append(key).append(" ").append(list.get(key)).append("\n");
		}
		return result.toString();
	}
}
