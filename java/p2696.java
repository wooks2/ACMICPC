package acmicpc;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class p2696 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> minPQ = new PriorityQueue<>();
		PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());
		int T = Integer.parseInt(br.readLine());
		
		int x;
		
		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			bw.write((N/2 + 1) + "\n");
			
			for(int i=0; i<(int)Math.ceil((double)N/10); i++) {
				String[] strNum = br.readLine().split(" ");
				for (int j = 1; j <= strNum.length; j++) {
					x = Integer.parseInt(strNum[j-1]);

					if (j % 2 == 1) {
						maxPQ.add(x);
					} else {
						minPQ.add(x);
					}
					if (!maxPQ.isEmpty() && !minPQ.isEmpty()) {
						if (maxPQ.peek() > minPQ.peek()) {
							int temp = maxPQ.poll();
							maxPQ.add(minPQ.poll());
							minPQ.add(temp);
						}
					}
					if(j % 2 == 1) {
						if(j % 10 == 0)
							bw.write(maxPQ.peek() + "\n");
						else bw.write(maxPQ.peek() + " ");
					}
						

				}
			}
			
			
			
			maxPQ.clear();
			minPQ.clear();
			bw.write("\n");
			bw.flush();
		}
		bw.close();
	}

}
