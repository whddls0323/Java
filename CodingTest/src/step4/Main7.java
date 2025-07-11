package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 4단계 7번 문제 - 과제 안 내신 분..?
*/

public class Main7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[30];
		boolean[] arr2 = new boolean[30];
		
		for(int i=0;i<30;i++)
			arr1[i] = i + 1;
		
		for(int i=0;i<28;i++) {
			int n = Integer.parseInt(br.readLine());
			
			for(int j=0;j<30;j++) {
				if(arr1[j] == n)
					arr2[j] = true;
			}
		}

		for(int i=0;i<30;i++) {
			if(arr2[i] == false)
				System.out.println(i + 1);
		}
	}
}
