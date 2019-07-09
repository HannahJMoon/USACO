package USACO_silver_class;
import java.io.*;
import java.util.*;
public class pails {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int m = in.nextInt();

		int X = m/x;
		int Y = m/y;
		int ans = 0;
		for(int i = 0; i <= X; i++){
			for(int a = 0; (a*y)+(i*x) <= m; a++){
				ans = Math.max(ans, (a*y) + (i*x));
			}
		}
		System.out.println(ans);
	}
		
}
