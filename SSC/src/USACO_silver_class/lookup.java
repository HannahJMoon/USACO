package USACO_silver_class;
import java.util.*;
import java.io.*;

public class lookup {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) throws FileNotFoundException {
		
		int numCows = in.nextInt();
		int[] cowHeights = new int[numCows];
		int[] answers = new int[numCows];
		for (int i = 0; i < numCows; i++) {
			cowHeights[i] = in.nextInt();
			answers[i] = 0;
		}
		Stack <Integer> s = new Stack();
		s.push(0);
		for (int i = 1; i < numCows; i++) {
			if (!s.isEmpty()) {
				while (cowHeights[s.peek()] < cowHeights[i]) {
					answers[s.peek()] = i + 1;
					s.pop();
					if (s.isEmpty()) {
						break;
					}
				}
			}
			s.push(i);
		}
		for (int i = 0; i < numCows; i++) {
			System.out.println(answers[i]);
		}
	}

}