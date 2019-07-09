package USACO_silver_class;

import java.util.*;

public class LIFO {
	
	static Scanner in = new Scanner (System.in);
	static Stack <Character> s = new Stack <Character>();
	static String a = in.nextLine();

	public static void main(String[] args) {
		
		if (calc()) {
			System.out.println("valid");
		}
		else System.out.println("not valid");
		
	}
	
	public static boolean calc () {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '(' || a.charAt(i) == '[' || a.charAt(i) == '{') {
				s.push(a.charAt(i));
			}
			else {
				if (s.isEmpty()) return false;
				if (a.charAt(i) == ')' && s.peek() != '(') return false;
				if (a.charAt(i) == ']' && s.peek() != '[') return false;
				if (a.charAt(i) == '}' && s.peek() != '{') return false;
				s.pop();
			}
		}
		return true;
	}

}
