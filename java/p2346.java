package acmicpc;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Pair<K, V> {
	K key;
	V value;
	
	public Pair(K k, V v) {
		this.key = k;
		this.value = v;
	}
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
}
public class p2346 {

	public static void main(String[] args) {
		Deque<Pair<Integer, Integer>> dq = new ArrayDeque<Pair<Integer, Integer>>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			dq.add(new Pair<Integer, Integer>(sc.nextInt(), i));
		}
		
		Pair<Integer, Integer> p = dq.poll();
		int value = p.getKey();
		int order = p.getValue();
		System.out.println(order);
		while(!dq.isEmpty()) {
			
			if(value > 0) {
				while(--value > 0) {
					dq.addLast(dq.pollFirst());
				}
				p = dq.pollFirst();
			} else {
				while(++value < 0) {
					dq.addFirst(dq.pollLast());
				}
				p = dq.pollLast();
				
			}
			value = p.getKey();
			order = p.getValue();
			System.out.println(order);
			
		}
	}

}
