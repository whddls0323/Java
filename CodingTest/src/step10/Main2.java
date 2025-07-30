package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/30
	이름: 윤종인
	내용: 백준 10단계 2번 문제 - 직사각형에서 탈출 
*/

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int min = 0;
		
		int x1 = w - x;
		int x2 = x;
		int y1 = h - y;
		int y2 = y;
		
		min = Math.min(x1,Math.min(x2,Math.min(y1, y2)));
		
		System.out.println(min);
	}
}
