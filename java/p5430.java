package acmicpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p5430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		int T = sc.nextInt();
		sc.nextLine();

		
		while(T-- > 0) {
			list.clear();
			boolean result = true;
			StringBuffer strBuffer = null;
			int index = 0;
			
			String command = sc.nextLine();
			int arrNum = sc.nextInt();
			sc.nextLine();
			String strArr = sc.nextLine();
			
			Character tempChar = null;
			StringBuffer strArrBuff = new StringBuffer(strArr);
			strArrBuff.delete(0, 1);
			strArrBuff.delete(strArrBuff.length()-1, strArrBuff.length());
			String[] split = strArrBuff.toString().split(",");
			for(int i=0; i<split.length; i++) {
				if(split[i].equals("")) {
					continue;
				} else {
					list.add(split[i]);
				}
			}
			
			if((arrNum != 0 && list.isEmpty()) || arrNum != list.size()) {
				result = false;
				System.out.println("error");
				continue;
			}
			
			for(int i=0; i<command.length(); i++) {
				tempChar = command.charAt(i);
				if(tempChar == 'D') {
					if(list.isEmpty()) {
						result = false;
						break;
					}
					list.remove(index);
					if(index != 0)
						--index;
				} else {
					if(index == 0) {
						index = list.size() -1;
					} else {
						index = 0;
					}
				}
			}
			
			strBuffer = new StringBuffer("");
			strBuffer.append("[");
			int size = list.size();
			if(index ==0) {
				for(int i=0; i<size; i++) {
					if(i == size -1) {
						strBuffer.append(list.get(i));
					} else {
						strBuffer.append(list.get(i) + ",");
					}
				}
			} else {
				for(int i=size-1; i>=0; i--) {
					if(i==0) {
						strBuffer.append(list.get(i));
					} else {
						strBuffer.append(list.get(i) + ",");
					}
				}
			}
			strBuffer.append("]");
			
			if(result)
				System.out.println(strBuffer.toString());
			else
				System.out.println("error");
		}
		
	}

}
