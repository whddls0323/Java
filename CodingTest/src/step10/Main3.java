package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/30
	이름: 윤종인
	내용: 백준 10단계 3번 문제 - 네 번째 점 
*/

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[1000]; 
		
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x - 1] += 1;
			arr[y - 1] += 1;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
