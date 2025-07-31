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
	내용: 백준 10단계 6번 문제 - 삼각형 외우기 
*/

public class Main6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());	
		int hap = a + b + c;
		
		if(a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
		} else if(hap == 180 && (a == c || b == c || a == b)) {
			System.out.println("Isosceles");
		} else if(hap == 180 && (a != c && b != c && a != b)) {
			System.out.println("Scalene");
		} else {
			System.out.println("Error");
		}
	}
}