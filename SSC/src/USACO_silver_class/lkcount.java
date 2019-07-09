package USACO_silver_class;
import java.io.*;
import java.util.*;

public class lkcount {

	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static int M = in.nextInt();
	static int [][] A = new int [N][M];
	static int lakes = 0;
	
	public static void main(String[] args) {
		 int id = 1;
		 String gap = in.nextLine();

		 for (int i = 0; i < N; i++){
			 	String line = in.nextLine();
			 	for (int j = 0; j < M; j++){
			 		if (line.charAt(j) == 'W') {
			 			A[i][j] = 0;
			 		}
			 		else A [i][j] = -1;
			 	}
		 }
		 for (int i = 0; i < N; i++){
		 	for (int j = 0; j < M; j++){
		 		if (A[i][j] == 0){
		 			floodFill (i, j, id);
		 			id++;
		 		}
		 	}
		 }
		 System.out.println(id-1);
	}

	private static int floodFill(int i, int j, int id) {
		int x = i;
		int y = j;
		A [x][y] = id;
	 	int c = 1;
	 	boolean change = true;
	 	while (change == true){
	 		change = false;
	 		for (int i1 = 0; i1 < N; i1++){
	 			for (int j1 = 0; j1 < M; j1++){
	 				if (A [i1][j1] == 0 && neighbor (i1, j1, id)){
	 					A [i1][j1] = id;
	 					c++;
	 					change = true;
	 				}
	 			}
	 		}
	 	}
		return c;
	}
	private static boolean neighbor (int x, int y, int id){
	 	for (int i = -1; i <= 1; i ++){
	 		for (int j = -1; j <= 1; j++){
	 			if (i == 0 && j == 0) continue;
	 			if (check (x+i, y+j) && A [x+i][y+j] == id) return true;
	 		}
	 	}
	 	return false;
	 }

	private static boolean check (int x, int y){
	 	if (x >= 0 && x < N && y >= 0 && y < M) return true;
	 	return false;
	 }
}
