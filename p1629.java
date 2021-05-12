package acmicpc;

import java.util.Scanner;

public class p1629 {
	public static long calc(long A, long B, long C) {
		if(B == 0) {
			return 1;
		}
		else if(B == 1) {
			return A % C;
		} else {
			
			long half = calc(A, B/2, C);
			if(B % 2 == 1) {
				return (((half * half % C)) * (A % C)) % C;
			}
			return (half * half) % C;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		System.out.println(calc(A, B, C));
			
	}
}
