package step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/23
	이름: 윤종인
	내용: 백준 8단계 7번 문제 - 달팽이는 올라가고 싶다
*/

public class Main7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int c = (v - b) / (a - b);
		if ((v - b) % (a - b) != 0)
			c++;
		System.out.println(c);
	}
}
