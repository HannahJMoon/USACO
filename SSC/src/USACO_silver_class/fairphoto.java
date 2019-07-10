package USACO_silver_class;

import java.util.*;

public class fairphoto {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
//	static Cows [] list  = new Cows [N];
	
	public static void main(String[] args) {
		
		for (int i = 0; i < N; i++) {
			int position = in.nextInt();
			String type = in.next();
//			list [i] = new Cows (position, type);
		}
		
		for (int i = 0; i < N; i++) {
			
		}

	}

}
/*
class Cows implements Comparable <Cows>{
	private int position;
	private String type;
	
	public int compareTo (Cows c) {
		if (c.position == this.position) {
			return Integer.toString(c.getPosition()).compareTo(this.getType());
		}
		else return -1;
	}
	
	public Cows (int p, String t) {
		this.position = p;
		this.type = t;
	}
	
	public int getPosition () {return position; }
	public String getType () {return type; }
}


*/

