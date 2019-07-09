package USACO_silver_class;

import java.io.*;
import java.util.*;

public class daisy {
	
	static Scanner in = new Scanner(System.in);
	static int N = in.nextInt();
	static int M = in.nextInt();
	static boolean[] marked = new boolean[N+1];
	static class Graph{
		int V;
		LinkedList<Integer> adjListArray[];
		Graph(int V){
			this.V = V;
			adjListArray = new LinkedList[V+1];
			for(int i = 1; i <= V; i++) {
				adjListArray[i] = new LinkedList<>();
			}
		}
	}
	static void addEdge(Graph graph, int src, int dest) {
		graph.adjListArray[src].add(dest);
		graph.adjListArray[dest].add(src);
	}
	public static void main(String[] args) {
		Graph graph = new Graph(N);
		for (int i = 0; i < M; i++) {
			addEdge(graph,in.nextInt(), in.nextInt());
		}
		
		dfs(graph, 1);
		
		boolean pr = false;
		for(int i = 1; i <= N; i++) {
			if(marked[i] == false) {
				System.out.println(i);
				pr = true;
			}
		}
		
		if(pr == false) {
			System.out.println(0);
		}
		
	}
	public static void dfs(Graph G, int v) {
		marked[v] = true;
		for(int w : G.adjListArray[v]) {
			if(!marked[w]) {
				dfs(G, w);
			}
		}
	}
}
