package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 3단계 5번 문제 - 코딩은 체육과목 입니다
*/

public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = n / 4;
		
		for(int i=0;i<m;i++) 
			System.out.print("long ");
		System.out.print("int");
	}
}
