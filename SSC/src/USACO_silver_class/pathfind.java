package USACO_silver_class;

import java.util.*;
import java.io.*;

public class pathfind {
	
	static Scanner in = new Scanner(System.in);
	static int N = in.nextInt();
	static int M = in.nextInt();
	static int [][] ocean = new int [N][N];
	static ArrayList <Integer>[] islands = new ArrayList [N];
	static boolean [] visited = new boolean [N];
	static int [] dist = new int[N+5];
	static int max = 0;
	static Queue <Integer> q = new LinkedList<Integer>();

	public static void main(String[] args) {
		
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < N; b++) {
				ocean [a][b] = in.nextInt();
			}
		}
		bfs();
		paths();
	}
	
	public static void paths () {
		System.out.println(M);
		for (int i = 1; i <= max; i++) {
			for (int a = 0; a < N; a++) {
				if(dist[a] == i){
					System.out.print(a+1 + " ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void bfs () {
		q.add(M-1);
		dist[M-1] = 0;
		visited[M-1] = true;
		while(!q.isEmpty()) {
			int current = q.remove();
			for(int i = 0; i < N; i++) {
				if(ocean[current][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
					dist[i] = dist [current] + 1;
					max = Math.max(max, dist[i]);
				}
			}
		}
		
	}

}
