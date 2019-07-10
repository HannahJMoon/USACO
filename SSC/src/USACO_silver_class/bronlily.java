package USACO_silver_class;
import java.io.*;
import java.util.*;

public class bronlily {

static int shortestPath = 2147483647;
static int N;
static int M;
static int dr;
static int dc;
static int cr;
static int cc;
static char [][] pasture;
static int [][] pasture2;

public static void main(String[] args) throws FileNotFoundException {

	Scanner in = new Scanner (System.in);
	M = in.nextInt();
	N = in.nextInt();
	pasture = new char[N][M];
	pasture2 = new int[N][M];
	for (int i = 0; i < N; i++) {
		String temp = in.next();
		for (int j = 0; j < M; j++) {
			pasture[i][j] = temp.charAt(j);
			if (pasture[i][j] == 'H') {
				dr = i;
				dc = j;
				pasture[i][j] = '.';
			}
			if (pasture[i][j] == 'K') {
				cr = i;
				cc = j;
			}
		}
	}
	bfs(cr, cc, 1);
}

public static void bfs(int cr, int cc, int index) {
	Queue<Integer> x = new LinkedList<Integer>();
	Queue<Integer> y = new LinkedList<Integer>();
	Queue<Character> indexes = new LinkedList<Character>();
	while (true) {
		
		if (cc < M - 1 && cr > 1) {
			if (pasture[cr - 2][cc + 1] == '.') {
				pasture[cr - 2][cc + 1] = '-';
				pasture2[cr - 2][cc + 1] = index;
				x.add(cc + 1);
				y.add(cr - 2);
				indexes.add((char) index);
			}
		}
		
		if (cc < M - 2 && cr > 0) {
			if (pasture[cr - 1][cc + 2] == '.') {
				pasture[cr - 1][cc + 2] = '-';
				pasture2[cr - 1][cc + 2] = index;
				x.add(cc + 2);
				y.add(cr - 1);
				indexes.add((char) index);
			}
		}
		
		if (cc < M - 2 && cr < N - 1) {
			if (pasture[cr + 1][cc + 2] == '.') {
				pasture[cr + 1][cc + 2] = '-';
				pasture2[cr + 1][cc + 2] = index;
				x.add(cc + 2);
				y.add(cr + 1);
				indexes.add((char) index);
			}
		}
	
		if (cc < M - 1 && cr < N - 2) {
			if (pasture[cr + 2][cc + 1] == '.') {
				pasture[cr + 2][cc + 1] = '-';
				pasture2[cr + 2][cc + 1] = index;
				x.add(cc + 1);
				y.add(cr + 2);
				indexes.add((char) index);
			}
		}

		if (cc > 0 && cr < N - 2) {
			if (pasture[cr + 2][cc - 1] == '.') {
				pasture[cr + 2][cc - 1] = '-';
				pasture2[cr + 2][cc - 1] = index;
				x.add(cc - 1);
				y.add(cr + 2);
				indexes.add((char) index);
			}
		}

		if (cc > 1 && cr < N - 1) {
			if (pasture[cr + 1][cc - 2] == '.') {
				pasture[cr + 1][cc - 2] = '-';
				pasture2[cr + 1][cc - 2] = index;
				x.add(cc - 2);
				y.add(cr + 1);
				indexes.add((char) index);
			}
		}

		if (cc > 1 && cr > 0) {
			if (pasture[cr - 1][cc - 2] == '.') {
				pasture[cr - 1][cc - 2] = '-';
				pasture2[cr - 1][cc - 2] = index;
				x.add(cc - 2);
				y.add(cr - 1);
				indexes.add((char) index);
			}
		}

		if (cc > 0 && cr > 1) {
			if (pasture[cr - 2][cc - 1] == '.') {
				pasture[cr - 2][cc - 1] = '-';
				pasture2[cr - 2][cc - 1] = index;
				x.add(cc - 1);
				y.add(cr - 2);
				indexes.add((char) index);
			}
		}
		
		if (cr == dr && cc == dc) {
			System.out.println(pasture2[dr][dc]);
		}
		cr = y.peek();
		y.remove();
		cc = x.peek();
		x.remove();
		index = indexes.peek() + 1;
		indexes.remove();
	}
}

}
