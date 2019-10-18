import java.util.*;

public class space {
	
	static Scanner in = new Scanner(System.in);
	static int N = in.nextInt();
	static int[][] outerSpace =  new int[N][N];
	static int[] dr = {0, 0, 1, -1, 1, 1, -1,-1};
	static int[] dc = {1, -1, 0, 0, 1, -1, 1,-1};
	
	public static void main(String[] args) {
		
		in.nextLine();
		for(int i = 0; i < N; i++) {
			String line= in.nextLine();
			for(int j = 0; j < N; j++) {
				if(line.charAt(j) == '*') outerSpace[i][j] = 0;
				else outerSpace[i][j] = -1;
			}
		}
		
		int nrA = 1;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(outerSpace[i][j] == 0) {
					floodfill (i, j, nrA);
					nrA++;
				}
			}
		}
		
		System.out.println(nrA);
				
	}
	public static void floodfill(int x, int y, int nrA) {
		
		Queue<totalA> q = new LinkedList<totalA>();
		q.add(new totalA(x,y));
		outerSpace[x][y] = nrA;
		
		while(!q.isEmpty()) {
			totalA cur = q.remove();
			for(int i =0; i < 8; i++) {
				int nr = cur.x +dr[i];
				int nc = cur.y + dc[i];
				if(neighbor(nr,nc) && outerSpace[nr][nc] == 0) {
					outerSpace[nr][nc] = nrA;
					q.add(new totalA(nr,nc));
				}
			}
		}
		
	}
	public static boolean neighbor(int nr, int nc) {
		
		if (nr <0 || nc < 0 || nr >= N || nc >= N) return false;
		return true;
		
	}
	
}
class totalA {
	
	int x;
	int y;

	public totalA(int X, int Y) {
		this.x = X;
		this.y = Y;
	}
	
}