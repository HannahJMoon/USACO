package USACO_silver_class;

import java.util.*;

public class meteor {

    static Scanner in = new Scanner (System.in);
    
    public static void main(String[] args){
    	
        int[][] map = new int[305][305];
        int SAFE = Integer.MAX_VALUE;
        int M = in.nextInt();
        int [] dr = new int [4];
        int [] dc = new int [4];
        Queue <Cow1> q = new LinkedList<Cow1>();
        dr [0] = 1;
        dr [1] = -1;
        dr [2] = 0;
        dr [3] = 0;
        dc [0] = 0;
        dc [1] = 0;
        dc [2] = 1;
        dc [3] = -1;
        
        for(int i = 0; i <= 301; i++) {
			for(int j = 0; j <= 301; j++) {
				map[i][j] = SAFE;
			}
		}
		for(int i = 0; i < M; i++) {
			int r = in.nextInt();
			int c = in.nextInt();
			int t = in.nextInt();
			map[r][c] = Math.min(map[r][c], t);
			for(int j = 0; j < 4; j++) {
				int nr = r + dr[j];
				int nc = c + dc[j];
				if (valid(nr, nc)) {
					map[nr][nc] = Math.min(map[nr][nc], t);
				}
			}
		}
		q.add(new Cow1(0, 0, 0));
		if(map[0][0] == SAFE) {
			System.out.println(0);
			return;
		}
		map[0][0] = 0;
		while(!q.isEmpty()) {
			Cow1 cur = q.remove();
			if(map[cur.x()][cur.y()] == SAFE) {
				System.out.println(cur.time());
				return;
			}
			for(int i = 0; i < 4; i++) {
				int nr = cur.x() + dr[i];
				int nc = cur.y() + dc[i];
				if(nr >= 0 && nc >= 0 && cur.time() +1 < map[nr][nc]) {
					q.add(new Cow1(nr, nc, cur.time()+1));
					if(map[nr][nc] != SAFE) {
						map[nr][nc] = 0;
					}
					
				}
			}
		}
		
		System.out.println(-1);
	}
	public static boolean valid(int nr, int nc) {
		if(nr < 0 || nc < 0) {
			return false;
		}
		return true;
	}

}

class Cow1 {
	
    private int x;
    private int y;
    private int time;
    
    public Cow1 (int x, int y, int t) {
        this.x = x;
        this.y = y;
        this.time = t;
    }
    public int x () {return x; }
	public int y () {return y; }
	public int time () {return time; }
    
}