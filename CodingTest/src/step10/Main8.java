package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/31
	이름: 윤종인
	내용: 백준 10단계 8번 문제 - 세 막대
*/

public class Main8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int hap = a + b + c;
		int max = Math.max(a, Math.max(b, c));
		int result = hap - max;
		
		while(true) {
			if(result > max) {
				result += max;
				break;
			} else {
				max--;
			}
		}
		System.out.println(result);
	}
}