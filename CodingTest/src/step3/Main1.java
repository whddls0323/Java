package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 3단계 1번 문제 - 구구단
*/

public class Main1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=9;i++) 
			System.out.println(n + " * " + i + " = " + n * i);
	}
}
