package ExamJava_01;
import java.util.*;

public class elect {
	
	static Scanner in = new Scanner (System.in);
    static ArrayList<vote> votes=  new ArrayList<vote>();
    static int N = in.nextInt();
    static int K = in.nextInt();
    static int [] fv = new int [K];
    static HashMap<Integer, Integer>  finIndex = new LinkedHashMap<Integer,Integer>();
    
    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            int pre = in.nextInt();
            int fin = in.nextInt();
            votes.add(new vote(pre, fin));
            finIndex.put(fin, i);
        }
        
        Collections.sort(votes);
       
        for(int i = 0; i < K; i++) {
        		fv[i] = votes.get(i).fin;
        }
        int max = 0;
        for(int i = 0; i < K;i++) {
        		if(fv[i] > max) {
        			max = fv[i];
        		}
        }
        System.out.println(finIndex.get(max) + 1);
       
    }
}
class vote implements Comparable<vote>{
	int pre;
	int fin; 
	public int compareTo(vote m) {
		if(this.pre - m.pre != 0) {
			return m.pre - this.pre;
		}else {
			return -1;
		}
		
	}
	public vote(int p, int f) {
		this.pre = p; 
		 this.fin = f;
	}
	public int getP() {return pre;}
	public int getF() {return fin;}
}