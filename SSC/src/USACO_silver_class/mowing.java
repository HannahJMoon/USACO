package USACO_silver_class;
import java.io.*;
import java.util.*;

public class mowing {
  static Scanner in = new Scanner (System.in);
  static int n;
  static int [][] field = new int [2000][2000];
  static String [] direction;
  static int [] steps;

  public static void main(String[] args) {
    try {
      init();
      System.out.println(solve());
    }

    catch(Exception e){
      e.printStackTrace();
    }
  }

  

  public static void init () {
    n = in.nextInt();
    direction = new String [n];
    steps = new int [n];

    for (int i = 0; i < n; i++) {
      direction [i] = in.next();
      steps [i] = in.nextInt();
    }
  }

  public static int solve () {
    int t = 1;
    int ans = 10000000;
    int currX = 1000;
    int currY = 1000;
    
    for(int i=0; i<2000; i++)
      Arrays.fill(field[i], -1);

    for (int i = 0; i < n; i++) {
      int x = 0;
      int y = 0;
      if (direction[i].equals("N")) {
        y = 1;
      }
      else if (direction[i].equals("S")) {
        y = -1;
      }
      else if (direction[i].equals("E")) {
        x = 1;
      }
      else {
        x = -1;
      }
      for (int j = 1; j <= steps[i]; j++) {
        if(-1 != field [currX][currY]) {
          ans = Math.min(t - field [currX][currY], ans);
        }
        field [currX][currY] = t;
        currX += x; currY += y;
        t++;
      }
    }
    if(ans == 10000000)
      return -1;
    return ans;
  }
}