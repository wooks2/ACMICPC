package acmicpc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class p1918_again {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		Map<Character, Integer> priority = new HashMap<Character, Integer>();
		priority.put('(', 1);
		priority.put(')', 1);
		priority.put('-', 2);
		priority.put('+', 2);
		priority.put('*', 3);
		priority.put('/', 3);
		
		
		String str = sc.nextLine();
		StringBuffer strBuffer = new StringBuffer("");
		
		for(int i=0; i<str.length(); i++) {
			Character c = str.charAt(i);
			
			if(c >= 'A' && c <= 'Z') {
				strBuffer.append(c);
			} else if(c == '(') {
				stack.push(c);
			} else if(c == ')') {
				c = stack.pop();
				while(c != '(') {
					strBuffer.append(c);
					c = stack.pop();
				}
			} else {
				if(c == '*' || c =='/') {
					while (!stack.empty() 
							&& (priority.get(c) == priority.get(stack.peek()))) {
						strBuffer.append(stack.pop());
					}
					stack.push(c);
				} else if(c == '+' || c =='-') {
					while(!stack.empty() && stack.peek() != '(') {
						strBuffer.append(stack.pop());
					}
					stack.push(c);
				}
				

			}
		}
		
		while(!stack.empty()) {
			strBuffer.append(stack.pop());
		}
		System.out.println(strBuffer.toString());
	}

}
