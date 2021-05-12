package acmicpc;

import java.util.Scanner;

public class p9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.nextLine();
		int result = 0;
		
		for(int tc=0; tc<N; tc++) {
			result = 0;
			str = sc.nextLine();
			for(int idx=0; idx<str.length(); idx++) {
				if(str.charAt(idx) == '(') {
					++result;
				} else if(str.charAt(idx) == ')') {
					--result;
				} else {
					continue;
				}
				
				if(result < 0) {
					System.out.println("NO");
					break;
				}
			}
			if(result > 0) {
				System.out.println("NO");
			}
			
			if(result == 0) {
				System.out.println("YES");
			}
		}
		
	}

}
