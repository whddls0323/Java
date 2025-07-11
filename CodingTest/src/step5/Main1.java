package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 5단계 1번 문제 - 문자와 문자열
*/

public class Main1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int i = Integer.parseInt(br.readLine());
		System.out.println(s.charAt(i - 1));
	}
}
