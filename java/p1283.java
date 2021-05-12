package acmicpc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class p1283 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Map<Character, String> m = new HashMap<Character, String>();
	List<String> words = new ArrayList<String>();
	String word = null;
	boolean notWord = false;
	boolean notChar = false;
	int N = sc.nextInt();
	String str = sc.nextLine();
	for (int i = 0; i < N; i++) {
		words.clear();
		str = sc.nextLine();
		char init = str.charAt(0);
		int startIndex = 0;
		int endIndex = 0;
		do {
			endIndex = str.indexOf(" ", startIndex);
			if (endIndex == -1) {
				endIndex = str.length();
			}
			word = str.substring(startIndex, endIndex);
			
			String k = word.substring(0, 1);
			String upper = k.toUpperCase();
			String lower = k.toLowerCase();
			init = k.charAt(0);
			words.add(word);

			if (m.containsKey(init)) {
				startIndex = endIndex + 1;
				notWord = false;
				continue;
			} else {
				StringBuffer strBuff = new StringBuffer(str);
				StringBuffer wordBuff = new StringBuffer(word);
				wordBuff.replace(0, 1, "[" + init + "]");
				strBuff.replace(strBuff.indexOf(word), strBuff.indexOf(word) + word.length(), wordBuff.toString());
				System.out.println(strBuff.toString());
				m.put(lower.charAt(0), word);
				m.put(upper.charAt(0), word);
				notWord = true;
				break;
			}

		} while (endIndex != str.length());

		if (!notWord) {
			notChar = false;
			for(String s : words) {
				StringBuffer strBuff = new StringBuffer(str);
				StringBuffer wordBuff = new StringBuffer(s);

				for(int idx=0; idx<s.length(); idx++) {
					String key = s.substring(idx, idx+1);
					String lowerKey = key.toLowerCase();
					String upperKey = key.toUpperCase();
					if(m.containsKey(upperKey.charAt(0))) {
						continue;
					} else {
						String replaceKey = "[" + key + "]";
						wordBuff.replace(idx, idx+1, replaceKey);
						
						int wordIndex = str.indexOf(s);
						strBuff.replace(wordIndex, wordIndex + s.length(), wordBuff.toString());
						m.put(lowerKey.charAt(0), s);
						m.put(upperKey.charAt(0), s);
						System.out.println(strBuff.toString());
						notChar = true;
						break;
					}
				}
				
				if(notChar) {
					break;
				}
					
			}
			if(!notChar) {
				System.out.println(str);
			}
		}

		notWord = false;

	}
}

}