package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class p5397 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Character> strList = new LinkedList<Character>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ListIterator<Character> it = null;
		
		int T = Integer.parseInt(br.readLine());
		String passwd;
		
		while(T-- > 0) {
			passwd = br.readLine();
			strList.clear();
			
			Character c = null;
			int passwdSize = passwd.length();
			it = strList.listIterator();			
			
			for(int i=0; i<passwdSize; i++) {
				c = passwd.charAt(i);
				
				switch(c) {
				case '>':
					if(it.hasNext()) {
						it.next();
					}
					break;
				case '<':
					if(it.hasPrevious()) {
						it.previous();
					}
					break;
				case '-':
					if(it.hasPrevious()) {
						it.previous();
						it.remove();
					}
					break;
				default:
					it.add(c);
					break;
				}
			}
			
			for(Character ch : strList) {
				bw.write(ch);
			}
			bw.write("\n");
			
			bw.flush();
		}
		
	}

}
