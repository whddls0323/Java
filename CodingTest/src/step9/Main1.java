package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/23
	이름: 윤종인
	내용: 백준 9단계 1번 문제 - 배수와 약수
*/

public class Main1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a != b) {
				if(a == 0 && b == 0)
					break;
				else if(b % a == 0)
					System.out.println("factor");
				else if(a % b == 0)
					System.out.println("multiple");
				else {
					System.out.println("neither");
				}
			} else 
				break;
		}
	}
}
