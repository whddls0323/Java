package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 2단계 5번 문제 - 알람 시계
*/

public class Main5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			if(H == 0) {
				H = 24 - 1;
				M = 60 - 45 + M;
			} else {
				H -= 1;
				M = 60 - 45 + M;
			}
		} else {
			M -= 45;
		}
		
		System.out.println(H + " " + M);
	}
}

