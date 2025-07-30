package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/22
	이름: 윤종인
	내용: 백준 8단계 5번 문제 - 벌집
*/

public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		int range = 2;
		
		if(n == 1) {
			System.out.println(cnt);
		} else {
			while(range <= n) {
				range += (6*cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
