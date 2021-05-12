package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p1269 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int overlapped = 0;
		String[] num = br.readLine().split("\\s");
		int numA = Integer.parseInt(num[0]);
		int numB = Integer.parseInt(num[1]);
		
		
		String[] strSetA = br.readLine().split("\\s");
		String[] strSetB = br.readLine().split("\\s");
		
		Set<String> set = new HashSet<String>(Arrays.asList(strSetA).subList(0, numA));
		
		for(int i=0; i<numB; i++) {
			if(set.contains(strSetB[i])) {
				overlapped++;
			}
		}
		
		int result = (numA + numB) - (overlapped * 2);
		bw.write(result + "");
		br.close();
		bw.close();
	}

}
