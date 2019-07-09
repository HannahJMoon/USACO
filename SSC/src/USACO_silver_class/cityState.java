package USACO_silver_class;
import java.io.*;
import java.util.*;
public class cityState {
	
	static Scanner in = new Scanner (System.in);
	static int N = Integer.parseInt(in.nextLine());
	static Map <String, Integer> cityState = new HashMap<String, Integer>();
	
	public static void main(String[] args) throws IOException {
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.nextLine());
			String city = st.nextToken();
			String state = st.nextToken();
			if (!city.substring(0, 2).equals(state)) {
				String key = city.substring(0, 2) + state;
				if (!cityState.containsKey(key)) cityState.put(key, 1);
				else cityState.put(key, cityState.get(key) + 1);
			}
		}
		long ans = 0;
		for(String key: cityState.keySet()) {
			
			String temp = key.substring(2) + key.substring(0, 2);
			if(cityState.containsKey(temp)) {
				ans += cityState.get(key) * cityState.get(temp);
			}
			
		}
		
		System.out.println(ans / 2);
	}
}