package ExamJava_01;

import java.util.*;
import java.io.*;

public class catchcow {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int farmer = in.nextInt();
		int cow = in.nextInt();
		int minutes =0;
		if (farmer > cow) {
			for (int i = farmer; i < cow; i--) {
				minutes++;
			}
		}
		else {
			while (cow > 0){
				int f = farmer;
				int c = cow;
				if (cow - farmer * 2 <= cow - farmer) {
					minutes++;
					for (int i = farmer*2; i < cow; i--) {
						minutes++;
					}
					cow = cow - farmer * 2;
				}
				else {
					for (int i = farmer; i > cow; i++) {
						minutes++;
						cow --;
					}
					
				}
			}
		}
		System.out.println(minutes);
	}

}
