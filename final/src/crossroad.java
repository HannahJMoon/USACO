import java.util.*;

public class crossroad {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int nCows = in.nextInt();
	static int R = in.nextInt();
	static int [][] farm = new int [N][N];
	static Queue <Integer> xCoor = new LinkedList <Integer>();
	static Queue <Integer> yCoor = new LinkedList <Integer>();
	static int distant = 0;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < R; i++) {
			farm [in.nextInt()-1][in.nextInt()-1] = -1;
			farm [in.nextInt()-1][in.nextInt()-1] = -1;
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(farm[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < nCows; i++) {
			xCoor.add(in.nextInt());
			yCoor.add(in.nextInt());
		}
		
		for (int i = 0; i < nCows; i++) {
			pairs (xCoor.peek(), yCoor.peek());
		}
		
		System.out.println(distant);
		
	}
	
	public static void pairs (int x, int y) {
		
		 if (!check(x , y)) {
			 distant = distant + nCows - 1;
			 xCoor.remove(x);
			 yCoor.remove(y);
		 }
		
	}
	
	public static boolean check (int  x, int y) {
		//checking the corners
		if ((x == N && y == N)  && (farm[N-1][N-2] == -1) && (farm[N-2][N-1] == -1)) return false;
		else if ((x == 1 && y == N) && (farm[0][N-2] == -1) && (farm[1][N-1] == -1))  return false;
		else if ((x == 1 && y == 1) && (farm[0][1] == -1) && (farm[1][0] == -1)) return false;
		else if ((x == N && y == 1) && (farm[N-1][1] == -1) && (farm[N-2][0] == -1)) return false;
		
		
		
		else return true;
	}

}
