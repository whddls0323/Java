package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/14
	이름: 윤종인
	내용: 백준 6단계 3번 문제 - 별 찍기 - 7
*/

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i * 2 + 1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<(2 * n - 1) / 2;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=2 * n - 2;j>i*2+1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
