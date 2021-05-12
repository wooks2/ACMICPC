package acmicpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1874 {
	static StringBuffer strBuff = new StringBuffer("");
	public static void plus() {
		strBuff.append("+\n");
	}
	public static void minus() {
		strBuff.append("-\n");
	}
	public static String getStringBuffer() {
		return strBuff.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> stack = new ArrayList<Integer>();
		int[] rArray = null;

		int N = sc.nextInt();
		rArray = new int[N];
		int num = 0;
		int curr = 0;
		
		for(int i=0; i<N; i++) {
			rArray[i] = sc.nextInt();
		}
		
		
		for(int i=1; i<=N; ++i) {
			if(stack.isEmpty() || i <= rArray[curr]) {
				stack.add(i);
				plus();
			}
			
			if(!stack.isEmpty()) {
				while(stack.get(stack.size() - 1) == rArray[curr]) {
					stack.remove(stack.size()-1);
					minus();
					++curr;
					if(stack.isEmpty()) {
						break;
					}
				}
			}			
		}
		if(!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			System.out.println(getStringBuffer());
		}
		
	}
}
