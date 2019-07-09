package USACO_silver_class;
import java.io.*;
import java.util.*;
public class seating {
	static Scanner in = new Scanner (System.in);
	public static void main(String[] args) {
		
		ArrayList <seat> seats = new ArrayList <seat>();
		int C = in.nextInt();
		int R = in.nextInt();
		int [][] chart = new int [R][C];
		int id = 1;
		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				seats.add(new seat (i, j, dist(i, j, 1, (1+C)/2)));
			}
		}
		Collections.sort(seats);
		for (int i = 0; i < seats.size(); i++) {
			chart [seats.get(i).getR()-1][seats.get(i).getC()-1] = id;
			id++;
		}
		for (int a = R-1; a >= 0; a--) {
			for (int b = 0; b < C; b++) {
				System.out.print(chart[a][b] + " ");
			}
			System.out.println();
		}
	}
	
	public static int dist (int i, int j, int pr, int pc) {
		
		int distance = (i-pr)*(i-pr)+(j-pc)*(j-pc);
		return distance;
		
	}

}

class seat implements Comparable <seat>{
	int r;
	int c;
	int dist1;
	
	public int compareTo (seat m) {
		if (this.dist1 == m.dist1) {
			if (this.r == m.r) {
				return this.c - m.c;
			}
			else {
				return this.r - m.r;
			}
		}
		else return this.dist1 - m.dist1;
	}
	
	public seat(int i, int j, int dist) {
		this.r = i;
		this.c = j;
		this.dist1 = dist;
	}
	
	public int getR () {return r; }
	public int getC () {return c; }
	public int getDist1 () {return dist1; }
	
}