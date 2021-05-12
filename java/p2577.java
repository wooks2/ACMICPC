package acmicpc;

import java.util.Scanner;

public class p2577 {

	public static void main(String[] args) {
		int A, B, C;
		long num = 0;
		int[] result = new int[10];
		String strResult = null;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		num = A * B * C;
		
		strResult = Long.toString(num);
		
		for(int i=0; i<strResult.length(); i++) {
			result[strResult.charAt(i) - '0']++;
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
