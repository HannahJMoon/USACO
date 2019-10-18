package ExamJava_01;
import java.io.*;
import java.util.*;
public class cowrace {

	public static void main(String[] args) throws IOException {
			Scanner in = new Scanner (System.in);
			int n = in.nextInt();
			int m = in.nextInt();
			int[] elise;
			int[] bessie;
			int [] time1 = new int [n];
			int [] speed1 = new int [n];
			int [] time2 = new int [m];
			int [] speed2 = new int [m];
			int t1 = 0;
			int t2 = 0;
			for (int i = 0; i < n; i++){
				speed1[i] = in.nextInt();
				time1[i] = in.nextInt();
				t1 = t1 + time1[i];
			}
			for (int i = 0; i < m; i++){
				speed2[i] = in.nextInt();
				time2[i] = in.nextInt();
				t2 = t2 + time2[i];
			}
			bessie = new int [t1];
			elise = new int [t2];
			int temp = 0;
			for (int i = 0; i < n; i++){
				int speed = speed1[i];
				int time = time1[i];
				for (int a = temp; a < time + temp; a++) {
					bessie [a] = speed;
				}
				temp++;
			}
			temp = 0;
			for (int i = 0; i < m; i++){
				int speed = speed2[i];
				int time = time2[i];
				for (int a = temp; a < time + temp; a++) {
					elise [a] = speed;
				}
				temp+= time;
			}
			int change = 0;
			for (int i = 1; i < t1; i++) {
				if (bessie[i] == elise[i]) continue;
				else if (bessie [i] > elise [i]) {
					if (bessie [i] != bessie [i-1]) change++;
				}
				else if (bessie [i] < elise [i]) {
					if (elise [i] != elise [i-1]) change++;
				}
			}
			System.out.println(change);
	}
}