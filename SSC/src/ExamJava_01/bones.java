package ExamJava_01;
import java.util.*;
import java.io.*;
public class bones {
    
    static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {
        int ans = 0; 
	    int max = 0;
	    int [] f = new int [1001];
	    int s1 = in.nextInt();
	    int s2 = in.nextInt();
	    int s3 = in.nextInt();
        for(int i=1;i<=s3;i++){
     	    for(int j=1;j<=s2;j++){
    		    for(int k=1;k<=s1;k++){
    			    f[i+j+k]++;
    		    }
    	    }
        }
        for(int i=1;i<=s1+s2+s3;i++){
            if(max<f[i]){
                ans=i;
                max=f[i];
            }
        }
        System.out.println(ans);
    }
}
