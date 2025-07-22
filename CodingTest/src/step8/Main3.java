package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/21
	이름: 윤종인
	내용: 백준 8단계 3번 문제 - 
*/

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		while(n > 0) {
			char m = (char) ((n % b) + 'A'- 10);
			System.out.print(m);
			n = n / b;
		}
	}
}
