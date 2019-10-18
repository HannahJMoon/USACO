import java.util.*;

public class feedtime {
	
	static Scanner in = new Scanner(System.in);
	static StringTokenizer st = new StringTokenizer(in.nextLine());
	static int W = Integer.parseInt(st.nextToken());
	static int H = Integer.parseInt(st.nextToken());
	static int[][] field =  new int[H][W];
	static int[] dr = {0, 0, 1, -1, 1, 1, -1,-1};
	static int[] dc = {1, -1, 0, 0, 1, -1, 1,-1};
	
	public static void main(String[] args) {
		
		for(int i = 0; i < H; i++) {
			String line= in.nextLine();
			for(int j = 0; j <W; j++) {
				if(line.charAt(j) == '.') field[i][j] = 0;
				else field[i][j] = -1;
			}
		}
		
		int nrLakes = 1;
		int max = -1;
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(field[i][j] == 0) {
					max = Math.max(max, floodfill(i,j,nrLakes));
					nrLakes++;
				}
			}
		}
		
		System.out.println(max);
				
	}
	public static int floodfill(int x, int y, int nrLakes) {
		
		Queue<r> q = new LinkedList<r>();
		q.add(new r(x,y));
		int c = 1;
		field[x][y] = nrLakes;
		
		while(!q.isEmpty()) {
			r cur = q.remove();
			for(int i =0; i < 8; i++) {
				int nr = cur.x +dr[i];
				int nc = cur.y + dc[i];
				if(neighbor(nr,nc) && field[nr][nc] == 0) {
					field[nr][nc] = nrLakes;
					q.add(new r(nr,nc));
					c++;
				}
			}
		}
		
		return c;
		
	}
	public static boolean neighbor(int nr, int nc) {
		
		if (nr <0 || nc < 0 || nr >= H || nc >= W) {
			return false;
		}
		return true;
		
	}
	
}
class r {
	
	int x;
	int y;

	public r(int X, int Y) {
		this.x = X;
		this.y = Y;
	}
	
}