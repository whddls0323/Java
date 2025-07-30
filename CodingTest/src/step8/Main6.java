package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/22
	이름: 윤종인
	내용: 백준 8단계 6번 문제 - 분수찾기
*/

public class Main6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int a = 1,b = 0;
		
		while(true) {
			if(x <= a + b) {
				if(a % 2 == 1) {
					System.out.println((a - (x - b - 1)) + "/" + (x - b));
					break;
				}
				else {
					System.out.println((x - b) + "/" + (a - (x - b - 1)));
					break;
				}
			} else {
				b += a;
				a++;
			}
		}
	}
}
