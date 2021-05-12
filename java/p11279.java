package acmicpc;

import java.util.Scanner;


public class p11279 {
	public static int[] maxHeap = new int[100001];
	public static int nodeNum = 0;
	
	public static void insertNode(int x) {
		int index = ++nodeNum;
		
		while(index != 1 && x >= maxHeap[index / 2]) {
			maxHeap[index] = maxHeap[index / 2];
			index /= 2;
		}
		maxHeap[index] = x;
		
	}
	
	public static void deleteRootNode() {
		//int root = maxHeap[1];
		int temp = maxHeap[nodeNum--];
		
		int parentIndex = 1;
		int childIndex = 2;
		while(childIndex <= nodeNum) {
			if(childIndex < nodeNum && (maxHeap[childIndex] < maxHeap[childIndex+1])) {
				childIndex++;
			}
			
			if(temp >= maxHeap[childIndex]) {
				break;
			}
			
			maxHeap[parentIndex] = maxHeap[childIndex];
			parentIndex = childIndex;
			childIndex = parentIndex * 2;
		}
		
		maxHeap[parentIndex] = temp;
		
	}
	public static void printMaxNode() {
		if(nodeNum == 0) { 
			System.out.println(0);
		} else {
			System.out.println(maxHeap[1]);
			deleteRootNode();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int x;
		
		while(T-- > 0) {
			x = sc.nextInt();
			
			if(x == 0) {
				printMaxNode();
			} else {
				insertNode(x);
			}
		}
		
	}

}
