package acmicpc;

import java.util.Scanner;

public class p4458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.nextLine();
		for(int tc=0; tc<N; tc++) {
			str = sc.nextLine();
			StringBuilder builder = new StringBuilder(str);
			if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
				System.out.println(str);
				continue;
			}
			builder.setCharAt(0, (char)(str.charAt(0) - 32)); 
			System.out.println(builder.toString());
		}

	}

}
