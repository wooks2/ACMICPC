package acmicpc;

import java.util.Scanner;


public class p1927 {
	public static int[] minHeap = new int[100001];
	public static int nodeNum = 0;
	
	public void initHeap() {
		int heapSize = minHeap.length;
		for(int i=0; i<heapSize; i++) {
			minHeap[i] = Integer.MAX_VALUE;
		}
	}
	public static void insertNode(int x) {
		int index = ++nodeNum;
		
		while(index != 1 && x <= minHeap[index / 2]) {
			minHeap[index] = minHeap[index / 2];
			index /= 2;
		}
		minHeap[index] = x;
		
	}
	
	public static void deleteRootNode() {
		//int root = minHeap[1];
		int temp = minHeap[nodeNum--];
		
		int parentIndex = 1;
		int childIndex = 2;
		while(childIndex <= nodeNum) {
			if(childIndex < nodeNum && (minHeap[childIndex] > minHeap[childIndex+1])) {
				childIndex++;
			}
			
			if(temp <= minHeap[childIndex]) {
				break;
			}
			
			minHeap[parentIndex] = minHeap[childIndex];
			parentIndex = childIndex;
			childIndex = parentIndex * 2;
		}
		
		minHeap[parentIndex] = temp;
		
	}
	public static void printMinNode() {
		if(nodeNum == 0) { 
			System.out.println(0);
		} else {
			System.out.println(minHeap[1]);
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
				printMinNode();
			} else {
				insertNode(x);
			}
		}
		
	}

}
