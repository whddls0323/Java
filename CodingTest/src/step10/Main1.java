package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	날짜: 2025/07/30
	이름: 윤종인
	내용: 백준 10단계 1번 문제 - 직사각형
*/

public class Main1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(a * b);
	}
}
