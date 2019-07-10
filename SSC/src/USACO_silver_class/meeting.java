package USACO_silver_class;

import java.util.*;
import java.io.*;

public class meeting {

	static Scanner in = new Scanner(System.in);
	static int ans = 1000000;
	static int N = in.nextInt();
	static int M = in.nextInt();
	static int[][] bessie = new int[N][N];
	static int[][] elsie = new int[N][N];

	public static void main(String[] args) throws Exception {

		init (bessie);
		init (elsie);
		
		for (int i = 0; i < M; i++) {
			int temp1 = in.nextInt()-1;
			int temp2 = in.nextInt()-1;
			bessie[temp1][temp2] = in.nextInt();
			elsie[temp1][temp2] = in.nextInt();
		}
		
		TreeSet<Integer> bList = getPossibleDistances(bessie);
		TreeSet<Integer> eList = getPossibleDistances(elsie);
		int res = ans;
		
		for (Integer x: bList) {
			if (eList.contains(x)) res = Math.min(res, x);
		}
		
		if (res != ans)	System.out.println(res);
		else System.out.println("IMPOSSIBLE");

	}
	
	public static void init(int[][] graph) {
		
		for (int i=0; i<graph.length; i++) {
			Arrays.fill(graph[i], ans);
			graph[i][i] = 0;
		}
		
	}

	public static TreeSet<Integer> getPossibleDistances(int[][] graph) {

		int n = graph.length;
		TreeSet[] distances = new TreeSet[n];
		for (int i=0; i<n; i++) distances[i] = new TreeSet<Integer>();
		distances[n-1].add(0);
		
		for (int i=n-2; i>=0; i--) {
			for (int j=i+1; j<n; j++) {
				if (graph[i][j] != ans) {
					for (Integer x: (TreeSet<Integer>)distances[j]) {
						distances[i].add(x+graph[i][j]);
					}
				}
			}
		}
		
		return (TreeSet<Integer>) distances[0];
		
	}
}