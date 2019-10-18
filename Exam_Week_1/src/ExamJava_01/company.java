package ExamJava_01;

import java.io.*;
import java.util.*;
public class company {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int N = in.nextInt();
		in.nextLine();
		ArrayList<position> list1 =  new ArrayList<position>();
		ArrayList<position> list2 =  new ArrayList<position>();
		
		for(int i = 0; i < N; i++){
			String CIN = in.nextLine();
			StringTokenizer st = new StringTokenizer(CIN);
			String temp1 = st.nextToken();
			long rank = Long.parseLong(st.nextToken());
			list1.add(new position(temp1, rank));
		}
		
		for(int i = 1; i < N+1; i++){
			String company = in.nextLine();
			list2.add(new position(company, i));
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		int ans = 0;
		String comp = "";
		for(int i = 0; i < N; i++){
			String temp = list2.get(i).company;
			int c = 0;
			for(int j = 0; j < N; j++){
				String temp2 = list1.get(j).company;
				if(temp.equals(temp2)){
					if(j-i > ans){
						ans = j-i;
						comp = temp;
					}
					c++;
				}
			}
			if(c == 0){
				if(N-i+1 >ans){
					ans = N-i+1;
					comp = temp;
				}
			}
		}
		
		System.out.println(comp);
	}
	
}

class position implements Comparable<position>{
	String company;
	long rank;
	
	@Override
	public int compareTo(position l){
		if(this.rank < l.rank){
			return -1;
		}
		else
			return 1;
		
	}
	public position(String comp, long r){
		this.rank = r;
		this.company = comp;
	}
	public long getR() { return rank; }
	public String getC() { return company; }
}