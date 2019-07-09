package USACO_silver_class;

import java.util.*;

public class FIFO {
	
	static Scanner in = new Scanner (System.in);
	static int N = in.nextInt();
	static Queue <Integer> customer = new LinkedList <Integer> ();
	static Queue <Integer> [] desks = new LinkedList[10];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++)
			desks[i] = new LinkedList<Integer>();
		
		in.nextLine();
		while (in.hasNext()) {
			
			String temp1 = in.next();
			int temp2 = in.nextInt();
			if (temp1.equals("C")) {
				customer.add(temp2);
			}
			if (temp1.equals("D")) {
				desks[temp2].add(customer.peek());
				customer.remove();
			}
			
		}
		for(int i = 1; i <= N; i++) {
		    for(int j = 0; j <= desks[i].size(); j++){
		        System.out.print(desks[i].peek() + " ");
		        desks[i].remove();
		    }
		    System.out.println();
		}
		
	}

}
