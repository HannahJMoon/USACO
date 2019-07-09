package USACO_silver_class;
import java.io.*;
import java.util.*;

public class race {
	
	static int n;
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		int n = in.nextInt();
		ArrayList <result> results = new ArrayList <result>();
		for (int i = 0; i < n; i ++) {
			results.add(new result(in.nextInt(), in.nextInt(), in.nextInt()));
		}

		Collections.sort(results);
		for (result r : results) {
			System.out.println (r.getHours() + ":" + r.getMinutes() + ":" + r.getSeconds());
		}
		
	}

}
class result implements Comparable <result>{
	private int hours;
	private int minutes;
	private int seconds;
	public int compareTo (result m) {
		if (this.hours != m.hours) {
			return this.hours - m.hours;
		}
		else {
			if (m.minutes != this.minutes) {
				return this.minutes - m.minutes;
			}
			else {
				return this.seconds - m.seconds;
			}
			
		}
	}
	
	public result (int hr, int min, int secs) {
		this.hours = hr;
		this.minutes = min;
		this.seconds = secs;
	}
	
	public int getHours () {return hours; }
	public int getMinutes () {return minutes; }
	public int getSeconds () {return seconds; }
}
