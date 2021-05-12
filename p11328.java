package acmicpc;

import java.util.Scanner;

public class p11328 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = null;
		String str2 = null;
		int N;
		boolean result = false;
		N = sc.nextInt();
		
		for(int tc=0; tc<N; tc++) {
			int[] nStr1 = new int[26];
			int[] nStr2 = new int[26];
			
			
			result = false;
			str1 = sc.next();
			str2 = sc.next();
			
			for(int i=0; i<str1.length(); i++) {
				nStr1[str1.charAt(i) - 'a']++;
			}
			
			for(int i=0; i<str2.length(); i++) {
				nStr2[str2.charAt(i) - 'a']++;
			}
			
			for(int i=0; i<nStr1.length; i++) {
				if(nStr1[i] - nStr2[i] == 0) {
					result = true;
					continue;
				} else {
					result = false;
					break;
				}
			}
			
			if(result) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
			
		}

	}

}
