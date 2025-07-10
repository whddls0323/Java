package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 3단계 10번 문제 - 별 찍기 - 2
*/

public class Main10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) 
				System.out.print(" ");
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
