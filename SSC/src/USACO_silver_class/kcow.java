package USACO_silver_class;
import java.util.*;

public class kcow {
	
	static int n;
	static int m;
	static char[][] field;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		field = new char[m][n];
		int[] dr = {-2, -1, 1, 2, 2, 1, -1, -2};
		int[] dc = {1, 2, 2, 1, -1, -2, -2, -1};
		Queue<Cow2> q = new LinkedList<>();
		int x = 0;
		int y = 0;
		int r = 0;
		int c = 0;
		in.nextLine();
		for(int i=0; i<m; i++){
			String temp = in.nextLine();
			for(int j=0; j<n; j++){
				char t = temp.charAt(j);
				field[i][j] = t;
				if(t=='K'){
					x = i;
					y = j;
				}
				if(t=='H'){
					r = i;
					c = j;
				}
			}
		}
		
		q.add(new Cow2(x, y, 0));
		field[x][y]='*';
		while(!q.isEmpty()){
			Cow2 cur = q.remove();
			if(cur.x == r && cur.y == c){
				System.out.println(cur.step);
			    return;
			}
			int nr = 0;
			int nc = 0;
			for(int i=0; i<8; i++){
				nr = cur.x+dr[i];
				nc = cur.y+dc[i];
    			if(valid(nr, nc)){
    				q.add(new Cow2(nr, nc, cur.step+1));
    				field[nr][nc]='*';
    			}
			}
		}
		
	}
	
	public static boolean valid (int x, int y){
		
		if(x >= m || x < 0 || y >= n || y < 0) return false;
		if(field[x][y]=='*') return false;
		return true;
		
	}
	
}

class Cow2{
	
	int x;
	int y;
	int step;

	public Cow2(int x, int y, int s){
		this.x = x;
		this.y = y;
		this.step = s;
	}
	
}