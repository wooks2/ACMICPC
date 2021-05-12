package acmicpc;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p1764 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> result = new TreeMap<String, Integer>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int T = N+M;
		int count = 0;
		String person = null;
		StringBuffer strBuffer = new StringBuffer();
		for(int i=0; i<T; i++) {
			person = sc.next();
			if(map.get(person) == null)
				map.put(person, 0);
			else {
				count++;
				result.put(person, 0);
			}
		}
		System.out.println(count);
		for(String s : result.keySet()) {
			System.out.println(s);
		}
	}

}
