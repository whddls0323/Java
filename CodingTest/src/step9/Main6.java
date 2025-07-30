package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/29
	이름: 윤종인
	내용: 백준 9단계 6번 문제 - 소인수분해
*/

public class Main6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				n /= i;
				i--;
			}
		}
	}
}
