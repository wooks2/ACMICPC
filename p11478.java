package acmicpc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p11478 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String sub = null;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=1; i<=str.length(); i++) {
			for(int j=0; j+i<=str.length(); j++) {
				sub = str.substring(j, j+i);
				if(map.get(sub) == null) {
					map.put(sub, i);
				}
			}
		}
		System.out.println(map.size());
	} 
}
