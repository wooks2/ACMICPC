package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class QueueTest {
	List<Integer> q = null;
	BufferedWriter bw = null;
	int front = 0;
	int back = -1;

	public QueueTest() {
		q = new LinkedList<Integer>();
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

	}

	public void print() throws IOException {
		bw.close();
	}

	public void command(String c) throws IOException {

		switch (c) {
		case "front":
			bw.write(Integer.toString(front()) + "\n");
			break;
		case "back":
			bw.write(back() + "\n");
			break;
		case "pop":
			bw.write(pop() + "\n");
			break;
		case "size":
			bw.write(size() + "\n");
			break;
		case "empty":
			bw.write(empty() + "\n");
			break;
		default:
			if (c.substring(0, 4).equals("push")) {
				push(Integer.parseInt(c.substring(5)));
			}
			break;
		}
	}

	public int empty() {
		if (q.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}

	public int front() {
		if (empty() == 1) {
			return -1;
		} else {
			return q.get(front);
		}
	}

	public int back() {
		if (empty() == 1) {
			return -1;
		} else {
			return q.get(back);
		}
	}

	public int pop() {
		if (empty() == 1) {
			return -1;
		} else {
			--back;
			return q.remove(front);
		}
	}

	public int size() {
		return q.size();
	}

	public void push(int n) {
		q.add(n);
		++back;
	}
}

public class p10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		QueueTest q = new QueueTest();
		int N = Integer.parseInt(br.readLine());
		String command = null;
		while((command = br.readLine()) != null && N-- > 0) {
			q.command(command);
			
		}

		q.print();
	}

}
