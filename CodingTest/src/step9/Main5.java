package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/28
	이름: 윤종인
	내용: 백준 9단계 5번 문제 - 소수
*/

public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());	
		int result = 0;
		int min = 10000;
		
		for(int i=m;i<=n;i++) {//내가 적은건 완전수 소수로 1과 자기자신으
			int cnt = 0;
			for(int j=2;j<=i;j++) {
				if(i % j == 0)
					cnt++;
			}
			if (cnt == 1) {
				result += i;
				if(min > i)
					min = i;
			}
		}
		
		if(result == 0) {
			System.out.println(-1);
		} else {
			System.out.println(result);
			System.out.println(min);
		}
	}
}
