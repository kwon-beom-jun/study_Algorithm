package baekjoon.step1_10000.step2001_3000.step2401_2500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2446 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < num*2; i++) {
			if (num > i) {
				for (int j = 0; j < i; j++) {
					sb.append(" ");
				}
				for (int j = 0; j < num*2-1-(i*2); j++) {
					sb.append("*");
				}
				sb.append("\n");
			} else if (num < i) {
				for (int j = 0; j < num*2-i-1; j++) {
					sb.append(" ");
				}
				for (int j = 0; j < (i-num)*2+1; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
