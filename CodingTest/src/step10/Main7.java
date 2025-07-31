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
	내용: 백준 10단계 7번 문제 - 삼각형과 세 변 
*/

public class Main7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int max = Math.max(a, Math.max(b, c));
			

			if(a == 0 && b == 0 && c == 0) {
				break;
			} else {
				if(max == a && b + c > a) {
					if(a == b && b == c && a == c) {
						System.out.println("Equilateral");
					} else if(a == b || b == c || a == c) {
						System.out.println("Isosceles");
					} else if(a != b && b != c && a != c) {
						System.out.println("Scalene");
					}
				} else if(max == b && a + c > b) {
					if(a == b && b == c && a == c) {
						System.out.println("Equilateral");
					} else if(a == b || b == c || a == c) {
						System.out.println("Isosceles");
					} else if(a != b && b != c && a != c) {
						System.out.println("Scalene");
					}
				} else if(max == c && a + b > c) {
					if(a == b && b == c && a == c) {
						System.out.println("Equilateral");
					} else if(a == b || b == c || a == c) {
						System.out.println("Isosceles");
					} else if(a != b && b != c && a != c) {
						System.out.println("Scalene");
					}
				} else {
					System.out.println("Invalid");
				}
			}
		}
	}
}