package acmicpc;

import java.util.Scanner;

public class p10799 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		int result = 0;
		for(int i=0; i<str.length(); i++) {
			Character c = str.charAt(i);
			if(c == '(') {
				++count;
			} else if(c == ')') {
				if(str.charAt(i-1) == '(') {
					--count;
					result += count;
				} else {
					--count;
					result += 1;
				}
				
			}
		}
		
		System.out.println(result);

	}

}
