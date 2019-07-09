package USACO_silver_class;
import java.io.*;
import java.util.*;
public class speeding {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
   	int[] limit = new int[101];
   	int[] cow = new int[101];

   	int n = in.nextInt();
   	int m = in.nextInt();
	int s = 0;
	int p = 0;
	for(int j=0; j<n; j++){
		p += in.nextInt();
		int speed = in.nextInt();
		for(int i=s; i<p; i++){
			limit[i] = speed;
		}
		s = p;
	}

	s = 0;
	p = 0; 
	for(int j=0; j<m; j++){
		p += in.nextInt();
		int speed = in.nextInt();
		for(int i=s; i<p; i++){
			cow[i] = speed;
		}
			s = p;
	}

	int maximum=0;
	for(int i=0; i<101; i++){
		maximum = Math.max(maximum, cow[i]-limit[i]);
	}

		System.out.println(maximum);

	}

}