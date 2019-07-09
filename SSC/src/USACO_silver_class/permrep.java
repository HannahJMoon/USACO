package USACO_silver_class;
import java.util.*;

public class permrep {

	static Scanner in = new Scanner (System.in);
	static char [] a;
	static String s = in.nextLine();
	static char [] word = s.toCharArray();
	static boolean [] used = new boolean [28];

	public static void main(String[] args) {

		Arrays.sort(word);
		a = new char [28];
		f(0);
		
	}
	
	public static void f (int x) {
		if (x == word.length) {
		    for (int i = 0; i < s.length(); i++){
		        System.out.print(a[i]);
		    }
		    System.out.println();
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			if (used [word[i] - 'a'] == false) {
				a[x] = word[i];
				used [word[i]-'a'] = true;
				f(x+1);
				used [word[i] - 'a'] = false;
			}
		}
	}

}
