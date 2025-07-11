package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 4단계 4번 문제 - 최댓값
*/

public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = 0,cnt = 0;
		
		for(int i=0;i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i])
				max = arr[i];
		}
		
		for(int i=0;i<9;i++) {
			cnt++;
			if(arr[i] == max)
				break;
		}
		
		System.out.println(max);
		System.out.println(cnt);
	}
}
