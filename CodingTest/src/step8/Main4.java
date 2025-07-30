package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/22
	이름: 윤종인
	내용: 백준 8단계 4번 문제 - 중앙 이동 알고리즘
*/

public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int a = 3;
		int b = 1;
		
		if(t == 1) {
			System.out.println(a * a);
		} else {
			for(int i=0;i<t-1;i++) {
				b *= 2;
				a += b;
			} 
			System.out.println(a * a);
		}
	}
}
