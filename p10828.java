package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class StackTest {
	List<Integer> s;
	int front = 0;
	public StackTest() {
		s = new ArrayList<Integer>();
	}
	
	public int Command(String s) {
		if(s.equals("size")) {
			return size();
		} else if(s.equals("empty")) {
			return empty();
		} else if(s.equals("pop")) {
			return pop();
		} else if(s.equals("top")) {
			return top();
		} else if(s.indexOf("push ") != -1) {
			int num = Integer.parseInt(s.substring(5));	
			push(num);

		    return -2;
		}
		return -2;
	}
	public int size() {
		return s.size();
	}
	public int empty() {
		if(s.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}
	public void push(int num) {
		front++;
		s.add(num);
	}
	public int pop() {
		if(empty() == 1) {
			return -1;
		}
		int num = s.get(--front);
		s.remove(front);
		return num;
	}
	
	public int top() {
		if(empty() == 1) {
			return -1;
		}
		return s.get(front-1);
	}
}
public class p10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StackTest s = new StackTest();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		int result = 0;
		for(int i=0; i<N; i++) {
			str = br.readLine();
			result = s.Command(str);
			if(result == -2)
				continue;
			else
				System.out.println(result);
		}
	
	}

}
