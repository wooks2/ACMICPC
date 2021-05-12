package acmicpc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class p1935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Double> stack = new Stack<Double>();
		Map<Character, Double> mapping = new HashMap<Character, Double>();
		double result = 0.0;
		int N = sc.nextInt();
		String expression = sc.nextLine(); //\n\r
		expression = sc.nextLine();
		
		
		int operand = 0;
		for(int i=0; i<N; i++) {
			operand = sc.nextInt();
			mapping.put((char)('A'+i), (double)operand);
		}
		
		for(int i=0; i<expression.length(); i++) {
			char c = expression.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				stack.push(mapping.get(c));
			} else {
				double opr2 = stack.pop();
				double opr1 = stack.pop();
				double res = 0.0;
				switch(c) {
				case '+':
					res = opr1+opr2;
					break;
				case '-':
					res = opr1-opr2;
					break;
				case '*':
					res = opr1*opr2;
					break;
				case '/':
					res = opr1/opr2;
					break;
				}
				stack.push(res);
			}
		}
		System.out.println(String.format("%.2f", stack.pop()));
	}
}
