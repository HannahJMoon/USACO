package USACO_silver_class;

import java.util.*;

public class grazing {
	
	static Scanner in = new Scanner (System.in);
	static int [][] A = new int [5][5];
	static int K = in.nextInt();

	public static void main(String[] args) {
	  int i = 0;
	  int j = 0;
	  int k = 0;

	  for (k = 0; k < K; k++) {
	    i = in.nextInt();
	    j = in.nextInt();
	    A[i-1][j-1] = 1;
	  }
	  
	  System.out.println(count(0,0));
	}


	public static int count(int i, int j)
	{
	  int c = 0;
	  if (i < 0 || i > 4 || j < 0 || j > 4 || A[i][j] != 0) return 0;
	  A[i][j] = 1; 
	  K++;
	  if (K==25 && i==4 && j==4) c = 1;
	  else c = count(i-1,j) + count(i+1,j) + count(i,j-1) + count(i,j+1);
	  A[i][j] = 0;
	  K--;
	  return c;
	}

}
