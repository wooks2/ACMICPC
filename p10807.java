package acmicpc;

import java.util.Scanner;

public class p10807 {

	public static void main(String[] args) {
		int N;
		int v;
		int[] arr;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		v = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			if(arr[i] == v)
				count++;
		}
		
		System.out.println(count);
	}

}
