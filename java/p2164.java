package acmicpc;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class p2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> card = new LinkedList<Integer>();
		int N = sc.nextInt();
		int result = 0;
		//phase true : discard, phase false : go to lowest
		boolean phase = true;
		
		for(int i=1; i<=N; i++) {
			card.add(i);
		}
		
		
		if(N == 1) {
			System.out.println(card.get(0));
			return;
		}
		
		
		while(card.size() > 1) {
			card.remove(0);
			card.add(card.remove(0));
		}
		
		System.out.println(card.get(0));
	}

}
