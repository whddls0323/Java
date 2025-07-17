package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/17
	이름: 윤종인
	내용: 백준 6단계 7번 문제 - 그룹 단어 체커
*/

public class Main7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = n;
		
		for(int i=0;i<n;i++) {
			String s = br.readLine(); //happy
			boolean[] check = new boolean[26];
			
			for(int j=0;j<s.length()-1;j++) {
				if(s.charAt(j) != s.charAt(j+1)) {
					if(check[s.charAt(j+1) - 'a'] == true) {
						cnt--;
						break;
					}
				}
				check[s.charAt(j) - 'a'] = true;
			}
		}
		System.out.println(cnt);
	}
}
