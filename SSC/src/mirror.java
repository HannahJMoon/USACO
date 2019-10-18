import java.util.*;
import java.io.*;

public class mirror {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner (System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();
		String[] grid = new String[rows];
		for (int i=0; i<rows; i++) {
			grid[i] = in.nextLine();
		}
		
		int result = 1;
		for (int i=0; i<rows; i++) {
			result = Math.max(result, sim(grid, i, -1, 0, 1));
			result = Math.max(result, sim(grid, i, cols, 0, -1));
		}

		for (int i=0; i<cols; i++) {
			result = Math.max(result, sim(grid, -1, i, 1, 0));
			result = Math.max(result, sim(grid, rows, i, -1, 0));
		}

		System.out.println(result);
	}

	public static int sim(String[] grid, int x, int y, int dX, int dY) {

		int cnt = 0;
		while (true) {
			cnt++;
			x += dX;
			y += dY;
			if (x<0 || y<0 || x>=grid.length || y>=grid[0].length()) break;
			int newdX = dY;
			int newdY = dX;
			if (grid[x].charAt(y) == '/') {
				newdX = -newdX;
				newdY = -newdY;
			}
			dX = newdX;
			dY = newdY;
		}
		return cnt-1;
		
	}
}