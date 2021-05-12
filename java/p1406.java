package acmicpc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class p1406 {
	public static void main(String[] args) throws IOException {
		List<Character> strList = new LinkedList<Character>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String command = null;
		int T = Integer.parseInt(br.readLine());

		
		for(int i=0; i<str.length(); i++) {
			strList.add(str.charAt(i));
		}
		
		
		ListIterator<Character> it = strList.listIterator();
		while(it.hasNext()) {
			it.next();
		}
		while(T-- > 0) {
			command = br.readLine();
			String parsing = command.substring(0, 1);
			String value = null;
			switch(parsing) {
			case "L":
				if(it.hasPrevious()) {
					it.previous();
				}
				break;
			case "D":
				if(it.hasNext()) {
					it.next();
				}
				break;
			case "B":
				if(it.hasPrevious()) {
					it.previous();
					it.remove();
				}
				break;
			case "P":
				value = command.substring(command.indexOf(" ") + 1);
				for(int i=0; i<value.length(); i++) {
					it.add(value.charAt(i));
					
				}
				break;
			default:
				break;
			}
		}
		
		for(Character c : strList) {
			bw.write(c);
		}
		
		bw.close();
	}
}
