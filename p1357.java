package acmicpc;

import java.util.Scanner;

public class p1357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X, Y;
		int result;
		String strX = null;
		String strY = null;
		String strResult = null;
		X = sc.nextInt();
		Y = sc.nextInt();
		
		strX = Integer.toString(X);
		strY = Integer.toString(Y);
		
		StringBuffer strBufX = new StringBuffer(strX);
		StringBuffer strBufY = new StringBuffer(strY);
		
		strX = strBufX.reverse().toString();
		strY = strBufY.reverse().toString();
		
		result = Integer.parseInt(strX) + Integer.parseInt(strY);
		strResult = Integer.toString(result);
		
		StringBuffer strBufResult = new StringBuffer(strResult);
		strResult = strBufResult.reverse().toString();
		System.out.println(Integer.parseInt(strResult));
	}

}
