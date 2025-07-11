package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 5단계 7번 문제 - 문자열 반복
*/

public class Main7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<r;k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}