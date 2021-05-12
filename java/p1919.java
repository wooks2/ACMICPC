package acmicpc;

import java.util.Scanner;

public class p1919 {
	static int count = 0;
	public static void main(String[] args) {
		int[] nStr1 = new int[26];
		int[] nStr2 = new int[26];
		int count = 0;
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();
		
		for(int i=0; i<str1.length(); i++) {
			nStr1[str1.charAt(i) - 'a']++;
		}
		
		for(int i=0; i<str2.length(); i++) {
			nStr2[str2.charAt(i) - 'a']++;
		}
		
		for(int i=0; i<nStr1.length; i++) {
			count += Math.abs(nStr1[i] - nStr2[i]);
		}
		
		System.out.println(count);
		
	}

}
