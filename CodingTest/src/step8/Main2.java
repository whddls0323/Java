package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/21
	이름: 윤종인
	내용: 백준 8단계 2번 문제 - 진법 변환 2
*/

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String s = "";
		
		while(n > 0) {
			if(10 <= n%b && n%b <= 35)
				s += (char) ((n % b) + 55);
			else
				s += n % b;
			n /= b;
		}
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
	}
}
