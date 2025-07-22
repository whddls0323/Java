package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/18
	이름: 윤종인
	내용: 백준 7단계 3번 문제 - 세로읽기
*/

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] arr = new String[5][15];
		
		for(int i=0;i<5;i++) {
			String s = br.readLine();
			for(int j=0;j<s.length();j++)
				arr[i][j] = s.charAt(j) + "";
		}
		
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(arr[j][i] == null)
					continue;
				else
					System.out.print(arr[j][i]);
			}
		}
	}
}
