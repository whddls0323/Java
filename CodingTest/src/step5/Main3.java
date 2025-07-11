package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 5단계 2번 문제 - 단어 길이 재기
*/

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(s.length());
	}
}
