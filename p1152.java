package acmicpc;

import java.util.Scanner;

public class p1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int count = 0;
		//" aab abc c"
		//" aab abc c "
		//"aab abc c "
		//"aab abc c"
		for(int i=0; i<str.length() - 1; i++) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		
		if(str.charAt(0) != ' ') {
			count++;
		}
		
		System.out.println(count);

	}

}
