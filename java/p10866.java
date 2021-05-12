package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

class DequeTest {
	BufferedWriter bw = null;
	List<Integer> deque = null;
	int front = 0;
	int back = -1;
	public DequeTest() {
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		deque = new LinkedList<Integer>();
	}
	
	public void Command(String command) throws IOException {
		String parsing = "";
		int nParsing = -1;
		int nNum = 0;
		switch(command) {
		case "size":
			bw.write(size() + "\n");
			break;
		case "empty":
			bw.write(empty() + "\n");
			break;
		case "front":
			bw.write(front() + "\n");
			break;
		case "back":
			bw.write(back() + "\n");
			break;
		case "pop_front":
			bw.write(pop_front() + "\n");
			break;
		case "pop_back":
			bw.write(pop_back() + "\n");
			break;
		default:
			if((nParsing = command.indexOf(" ")) != -1) {
				parsing = command.substring(0, nParsing);
				if(parsing.equals("push_front")) {
					nNum = Integer.parseInt(command.substring(nParsing+1));
					
					push_front(nNum);
					nParsing = -1;
				} else if(parsing.equals("push_back")) {
					nNum = Integer.parseInt(command.substring(nParsing+1));
					
					push_back(nNum);
					nParsing = -1;
				} else {
					break;
				}
			}
			break;
		}
	}
	
	public void push_front(int num) {
		deque.add(front, num);
		++back;
	}
	
	public void push_back(int num) {
		deque.add(num);
		++back;
	}
	
	public int pop_front() {
		if(empty() == 1) {
			return -1;
		} else {
			back--;
			return deque.remove(front);
			
		}
	}
	
	public int pop_back() {
		if(empty() == 1) {
			return -1;
		} else {
			return deque.remove(back--);
		}
	}
	
	public int size() {
		return deque.size();
	}
	
	public int empty() {
		if(deque.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int front() {
		if(empty() == 1) {
			return -1;
		} else {
			return deque.get(front);
		}
	}
	
	public int back() {
		if(empty() == 1) {
			return -1;
		} else {
			return deque.get(back);
		}
	}
	
	public void print() throws IOException {
		bw.close();
	}
	
}
public class p10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DequeTest dequeTest = new DequeTest();
		String com = null;
		int nCommand = Integer.parseInt(br.readLine());
		
		while((com = br.readLine()) != null && nCommand-- > 0) {
			dequeTest.Command(com);
		}
		dequeTest.print();
	}

}
