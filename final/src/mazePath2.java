import java.util.*;

public class mazePath2 {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int [][] maze = new int [N+2][N+2];
	static Queue <String> directions = new LinkedList <String>();
	
	public static void main(String[] args) {
		
		for (int a = 1; a <= N; a++) {
			for (int b = 1; b <= N; b++) {
				maze[a][b] = in.nextInt();
			}
		}
		
		check ();
		for (int i = 0; i < directions.size(); i++) {
			String temp = directions.remove();
			if (temp.equals("R")) System.out.println("L");
			else if (temp.equals("L")) System.out.println("R");
			else System.out.println(temp);
		}

	}
	
	public static void check () {
		
		int start = maze [1][1];
		
	}

}
