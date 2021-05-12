package acmicpc;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class p1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<Integer>();
		StringBuffer strBuff = new StringBuffer("");
		strBuff.append("<");
		int index = 0;
		int removed = 0;
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
		
		index = index + K - 1;
		while(!list.isEmpty() /*> K-1*/) {
			removed = list.remove(index--);
			if(list.isEmpty()) {
				strBuff.append(Integer.toString(removed) + ">");
				break;
			} else {
				strBuff.append(Integer.toString(removed) + ", ");
			}
	
			index = (index + K) % (list.size());
		}
		
		System.out.println(strBuff.toString());
	}

}
