package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 6단계 2번 문제 - 킹, 퀸, 룩, 비숍, 나이트, 폰
*/

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr1 = {1,1,2,2,2,8};
		int[] arr2 = new int[6];
		int[] arr3 = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<6;i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
			if(arr1[i] != arr2[i]) 
				arr3[i] = arr1[i] - arr2[i];
		}
		
		for(int item: arr3)
			System.out.print(item + " ");
	}
}
