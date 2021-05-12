package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class p1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, String> recA = new LinkedHashMap<String, String>();
		Map<String, String> recB = new LinkedHashMap<String, String>();
		
		String[] num = br.readLine().split("\\s");
		int N = Integer.parseInt(num[0]);
		int M = Integer.parseInt(num[1]);
		
		String pocketmon = null;
		String answer = null;
		
		for(int i=1; i<=N; i++) {
			pocketmon = br.readLine();
			recA.put(pocketmon, Integer.toString(i));
			recA.put(Integer.toString(i), pocketmon);
		}
		
		for(int i=1; i<=M; i++) {
			answer = br.readLine();
			if(recA.containsKey(answer)) {
				bw.write(recA.get(answer) + "\n");
			} else if(recB.containsValue(answer)) {
				bw.write(recB.get(answer) + "\n");
			}
			
		}
		br.close();
		bw.close();
	}

}
