
import java.util.*;
import java.io.*;

public class catchcow {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int farmer = in.nextInt();
		int cow = in.nextInt();
		int minutes = 0;
		if (cow == farmer) minutes = 0;
		else if (cow == farmer -1 || farmer == cow -1) minutes = 1;
		else if (farmer > cow) {
			for (int i = farmer; i > cow; i--) {
				minutes++;
			}
		}
		else {
			int dif = cow - farmer;
			while (dif >= 0){
				if (cow - farmer * 2 <= cow - farmer) {
					minutes++;
					for (int i = farmer*2; i > cow; i--) {
						minutes++;
					}
					dif = dif - farmer * 2;
				}
				else {
					for (int i = farmer; i < cow; i++) {
						minutes++;
					}
				}
			}
			minutes = minutes + 2;
		}
		System.out.println(minutes);
	}

}
