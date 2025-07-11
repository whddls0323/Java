package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 4단계 6번 문제 - 공 바꾸기
*/

public class Main6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int a=0;a<n;a++)
			arr[a] = a + 1;
		
		for(int a=0;a<m;a++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			int temp = arr[i - 1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = temp;
		}
		
		for(int item: arr)
			System.out.print(item + " ");
	}
}
