package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 5단계 3번 문제 - 문자열
*/

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<t;i++) {
			String s = br.readLine();
			sb.append(s.charAt(0))
			  .append("")
			  .append(s.charAt(s.length()-1))
			  .append("\n");
		}
		
		System.out.println(sb);
	}
}
