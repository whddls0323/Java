package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 2단계 7번 문제 - 주사위 세개
*/

public class Main7 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int max = 0;
		
		if(a == b && a == c) {
			System.out.println(10000 + a * 1000);
		} else if(a == b && b != c && a != c) {
			System.out.println(1000 + a * 100);
		} else if(a != b && b == c && a != c) {
			System.out.println(1000 + b * 100);
		} else if(a != b && b != c && a == c) {
			System.out.println(1000 + a * 100);
		} else {
			max = Math.max(a, Math.max(b, c));
			System.out.println(max * 100);
		}
	}
}

