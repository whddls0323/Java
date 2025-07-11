package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 5단계 4번 문제 - 아스키 코드
*/

public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int c = s.charAt(0);
		System.out.println(c);
	}
}
