package acmicpc;

import java.util.Scanner;

class PairAbs {
	int abs;
	int val;
	
	public PairAbs() {
		
	}
	public PairAbs(int x) {
		this.abs = Math.abs(x);
		this.val = x;
	}
	
	public void setData(int x) {
		this.abs = Math.abs(x);
		this.val = x;
	}
	
	public int getAbs() {
		return abs;
	}
	
	public int getVal() {
		return val;
	}
}

public class p11286 {
	private static PairAbs[] minHeap = new PairAbs[100001];
	private static int nodeNum = 0;
	public static void insertNode(int x) {
		int index = ++nodeNum;
		
		while(index != 1) {
			if(Math.abs(x) < minHeap[index /2].getAbs()) {
				minHeap[index] = minHeap[index / 2];
				index /= 2;
			} else if(Math.abs(x) == minHeap[index /2].getAbs()) {
				if(x <= minHeap[index / 2].getVal()) {
					minHeap[index] = minHeap[index / 2];
					index /= 2;
				} else {
					break;
				}
			} else {
				break;
			}
			
		}
		PairAbs data = new PairAbs(x);
		minHeap[index] = data;
		
	}
	
	public static void deleteRootNode() {
		PairAbs temp = minHeap[nodeNum--];
		
		int parentIndex = 1;
		int childIndex = 2;
		while(childIndex <= nodeNum) {
			if(childIndex < nodeNum) {
				if(minHeap[childIndex].getAbs() > minHeap[childIndex+1].getAbs()) {
					childIndex++;
					
				} else if(minHeap[childIndex].getAbs() == minHeap[childIndex+1].getAbs()) {
					if(minHeap[childIndex].getVal() > minHeap[childIndex+1].getVal()) {
						childIndex++;
					}
				}
			}
			
			if(temp.getAbs() <= minHeap[childIndex].getAbs() && temp.getVal() <= minHeap[childIndex].getVal()) {
				break;
			}
			
			minHeap[parentIndex] = minHeap[childIndex];
			parentIndex = childIndex;
			childIndex = parentIndex * 2;
		}
		
		minHeap[parentIndex] = temp;
		
	}
	public static void printMaxNode() {
		if(nodeNum == 0) { 
			System.out.println(0);
		} else {
			System.out.println(minHeap[1].getVal());
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
