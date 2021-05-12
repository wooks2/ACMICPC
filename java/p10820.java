package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p10820 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int small = 0;
		int big = 0;
		int number = 0;
		int space = 0;
		
		String str = null;
		
		try {
			while ((str = br.readLine()) != null ) {
				small = 0;
				big = 0;
				number = 0;
				space = 0;
				

				
				for(int i=0; i<str.length(); i++) {
					Character c = str.charAt(i);
					
					if(c >= 'a' && c <='z') {
						small++;
					} else if(c >= 'A' && c <= 'Z') {
						big++;
					} else if(c >= '0' && c <= '9') {
						number++;
					} else if(c == ' ') {
						space++;
					} else {
						continue;
					}
				}
				
				System.out.println(small + " " + big + " " + number + " " + space);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

			
	}
}
