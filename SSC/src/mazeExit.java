import java.util.*;

public class mazeExit {
	
	static Scanner in = new Scanner (System.in);
	static int N = 0;
	static int M = 0;
	static int SR = 0;
	static int SC = 0;
	static int exits = 0;
	static int [][] maze;
	static int [] dr = {1, -1, 0, 0};
	static int [] dc = {0, 0, 1, -1};

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer(in.nextLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		SR = Integer.parseInt(st.nextToken());
		SC = Integer.parseInt(st.nextToken());
		maze = new int [N][M];
		for (int i = 0; i < N; i++) {
			String s = in.nextLine();
			for (int j = 0; j < M; j++) {
				if(s.charAt(j) == '1')
					maze [i][j] = -1;
				else
					maze[i][j] = -2;
			}
		}
		int prev = maze[SR-1][SC-1];
		floodFill(SR-1, SC-1, prev, 0);
		int min = 0;
		int minX = 0;
		int minY  = 0;
		for (int i = 0; i < N; i ++) {
			for (int j = 0; j < M; j++) {
				if (i == 0 || j == 0 || i == N-1 || j == M-1) {
					if (maze[i][j] > 0) {
						exits++;
						if (min == 0) min = maze [i][j];
						if (maze[i][j] < min) {
							min = maze[i][j];
							minX = i+1;
							minY = j+1;
						}
					}
				}	
			}
		}
		System.out.println(minX+ " " +minY);
		System.out.println(min);
		
		System.out.println(exits);

	}
	
	public static void floodFill (int r, int c, int prev, int p) {
		
		Queue<coor> q = new LinkedList<coor>();
		q.add(new coor(r,c));
		maze[r][c] = p;
		while (!q.isEmpty()) {
			coor cur = q.remove();
			for (int i = 0; i < 4; i++) {
				int nr = cur.row() + dr[i];
				int nc = cur.col() + dc[i];
				if (inBound (nr, nc) && maze [nr][nc] == prev) {
					maze[nr][nc] = maze[cur.row()][cur.col()]+1;
					q.add(new coor (nr, nc));
				}
			}
		}
		
	}
	
	public static boolean inBound (int nr, int nc) {
		
		if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
			return true;
		}
		else return false;
		
	}

}

class coor{
	
	private int row;
	private int col;

	public coor(int r, int c){
		this.row = r;
		this.col = c;
	}
	
	public int row () {return row; }
	public int col () {return col; }
	
}
