package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/17
	이름: 윤종인
	내용: 백준 7단계 1번 문제 - 행렬 덧셈
*/

public class Main1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
	
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				arr[i][j] += Integer.parseInt(st.nextToken());
			}
		}
		
		for(int[] ar : arr) {
			for(int a : ar)
				System.out.print(a + " ");
			System.out.println();
		}
	}
}
