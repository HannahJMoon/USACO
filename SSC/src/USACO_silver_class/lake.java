package USACO_silver_class;
import java.io.*;
import java.util.*;

public class lake {
	
	static Scanner in = new Scanner (System.in);
	static int l = in.nextInt();
	static int w = in.nextInt();
	static int coor = in.nextInt();
	static int[][] field = new int[l+2][w+2];
	
	public static void main(String[] args) {
		String gap = in.nextLine();
		for(int i =0; i < l; i++) {
			for(int j = 0; j < w; j++) {
				field[i][j]= -1;
			}
		}
		for(int i = 0; i < coor; i++) {
			int k = in.nextInt()-1;
			int m = in.nextInt()-1;
			field[k][m] = 0;
		}
		ArrayList<Integer> fields = new ArrayList<Integer>();
		int id = 1;
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < w; j++) {
				if(field[i][j] == 0) {
					fields.add(floodfill(i,j,id));
					id++;
				}
			}
		}
		int max = fields.get(0);
		for(int i = 1; i < fields.size(); i++) {
			if (max < fields.get(i)) {
				max = fields.get(i);
			}
		}
		System.out.println(max);
	}
	public static int floodfill(int x, int y, int id) {
		int c = 1;
		field[x][y] = id;
		boolean change = true;
		while(change== true) {
			change = false;
			for(int i = 0; i <l; i++) {
				for(int j = 0; j < w; j++) {
					if(field[i][j] == 0 && neighbor(i,j,id)) {
						field[i][j] = id;
						c++;
						change = true;
					}
				}
			}
		}
		return c;
	}
	public static boolean neighbor(int x, int y, int id) {
		if(x>0 && field[x-1][y] == id) {
			return true;
		}
		if(x< l&& field[x+1][y] == id) {
			return true;
		}
		if(y>0 && field[x][y-1] == id) {
			return true;
		}if(y< w-1 && field[x][y+1]== id) {
			return true;
		}
		return false;
	}
	public static boolean check (int x, int y) {
		if(x>= 0 && x< l && y >=0 && y< w) {
			return true;
		}
		return false;
	}

}
