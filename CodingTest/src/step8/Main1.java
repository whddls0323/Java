package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/21
	이름: 윤종인
	내용: 백준 8단계 1번 문제 - 진법 변환
*/

public class Main1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		int tmp = 1;
		int result = 0;
		
		for(int i=n.length()-1;i>=0;i--) {
			char c = n.charAt(i);
			
			if('A' <= c && c <= 'Z')
				result += (c - 'A' + 10) * tmp;
			else
				result += (c - '0') * tmp;
			tmp *= b;
		}
		System.out.println(result);
	}
}
