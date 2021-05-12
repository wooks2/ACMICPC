package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class p14425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Set<String> strSet = new TreeSet<String>();
		
		String[] num = br.readLine().split("\\s");
		int N = Integer.parseInt(num[0]);
		int M = Integer.parseInt(num[1]);
		int count = 0;
		
		for(int i=0; i<N; i++) {
			strSet.add(br.readLine());
		}

		String subStr = null;
		for(int i=0; i<M; i++) {
			subStr = br.readLine();
			if(strSet.contains(subStr)) {
				count++;
			}
		}
		
		
		bw.write(count + "\n");
		br.close();
		bw.close();

	}

}
