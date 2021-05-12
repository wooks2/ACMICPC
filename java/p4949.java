package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Character> list = new ArrayList<Character>();
		String str = null;
		
		while(true) {
			list.clear();
			str = br.readLine();
			
			if(str.equals(".")) 
				break;
			
			for(int i=0; i<str.length(); i++) {
				Character c = str.charAt(i);
				
				if(c == '(') {
					list.add(c);
					continue;
				}
				
				if(c == '[') {
					list.add(c);
					continue;
				}
				
				if(c == ')') {
					if(list.isEmpty()) {
						list.add(c);
						break;
					} else if(list.get(list.size() -1) == '(') {
						list.remove(list.size() -1);
							continue;
					} 

				}
				
				if(c == ']') {
					if(list.isEmpty()) {
						list.add(c);
						break;
					} else if(list.get(list.size() - 1) == '[') {
						list.remove(list.size() -1);
						continue;
					} 
				}
				
			}
			if(!list.isEmpty()) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}

	}

}
