package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 2단계 6번 문제 - 오븐 시계
*/

public class Main6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());

		if(b + c >= 60) {
			a = a + (b+c) / 60;
			if(a >= 24) {
				a = a % 24;
			}
			b = (b + c) % 60;
		} else {
			b = b + c; 
		}
		System.out.println(a + " " + b);
	}
}

