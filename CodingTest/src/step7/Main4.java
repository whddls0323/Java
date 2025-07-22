package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/18
	이름: 윤종인
	내용: 백준 7단계 4번 문제 - 색종이 
*/

public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[100][100];
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=x;j<x+10;j++) {
				for(int k=y;k<y+10;k++)
					arr[k][j] = 1;
			}
		}
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(arr[i][j] == 1)
					sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
