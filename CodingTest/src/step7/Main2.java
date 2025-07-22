package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/18
	이름: 윤종인
	내용: 백준 7단계 2번 문제 - 최댓값
*/

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		int max = 0,row = 0,col = 0;
		
		for(int i=0;i<9;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(max < arr[i][j]) {
					max = arr[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((row + 1) + " " + (col + 1));
	}
}
